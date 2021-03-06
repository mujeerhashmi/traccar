/*
 * Copyright 2019 - 2020 Anton Tananaev (anton@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.config;

import java.util.Collections;

public final class Keys {

    /**
     * Network interface for a the protocol. If not specified, server will bind all interfaces.
     */
    public static final ConfigSuffix<String> PROTOCOL_ADDRESS = new ConfigSuffix<>(
            ".address",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Port number for the protocol. Most protocols use TCP on the transport layer. Some protocols use UDP. Some
     * support both TCP and UDP.
     */
    public static final ConfigSuffix<Integer> PROTOCOL_PORT = new ConfigSuffix<>(
            ".port",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Connection timeout value in seconds. Because sometimes there is no way to detect lost TCP connection old
     * connections stay in open state. On most systems there is a limit on number of open connection, so this leads to
     * problems with establishing new connections when number of devices is high or devices data connections are
     * unstable.
     */
    public static final ConfigSuffix<Integer> PROTOCOL_TIMEOUT = new ConfigSuffix<>(
            ".timeout",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Server wide connection timeout value in seconds. See protocol timeout for more information.
     */
    public static final ConfigKey<Integer> SERVER_TIMEOUT = new ConfigKey<>(
            "server.timeout",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Address for uploading aggregated anonymous usage statistics. Uploaded information is the same you can see on the
     * statistics screen in the web app. It does not include any sensitive (e.g. locations).
     */
    public static final ConfigKey<String> SERVER_STATISTICS = new ConfigKey<>(
            "server.statistics",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Enable events subsystem. Flag to enable all events handlers.
     */
    public static final ConfigKey<Boolean> EVENT_ENABLE = new ConfigKey<>(
            "event.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * If true, the event is generated once at the beginning of overspeeding period.
     */
    public static final ConfigKey<Boolean> EVENT_OVERSPEED_NOT_REPEAT = new ConfigKey<>(
            "event.overspeed.notRepeat",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Minimal over speed duration to trigger the event. Value in seconds.
     */
    public static final ConfigKey<Long> EVENT_OVERSPEED_MINIMAL_DURATION = new ConfigKey<>(
            "event.overspeed.minimalDuration",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Relevant only for geofence speed limits. Use lowest speed limits from all geofences.
     */
    public static final ConfigKey<Boolean> EVENT_OVERSPEED_PREFER_LOWEST = new ConfigKey<>(
            "event.overspeed.preferLowest",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Do not generate alert event if same alert was present in last known location.
     */
    public static final ConfigKey<Boolean> EVENT_IGNORE_DUPLICATE_ALERTS = new ConfigKey<>(
            "event.ignoreDuplicateAlerts",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * If set to true, invalid positions will be considered for motion logic.
     */
    public static final ConfigKey<Boolean> EVENT_MOTION_PROCESS_INVALID_POSITIONS = new ConfigKey<>(
            "event.motion.processInvalidPositions",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * If the speed is above specified value, the object is considered to be in motion. Default value is 0.01 knots.
     */
    public static final ConfigKey<Double> EVENT_MOTION_SPEED_THRESHOLD = new ConfigKey<>(
            "event.motion.speedThreshold",
            Collections.singletonList(KeyType.GLOBAL),
            0.01);

    /**
     * Global polyline geofence distance. Within that distance from the polyline, point is considered within the
     * geofence. Each individual geofence can also has 'polylineDistance' attribute which will take precedence.
     */
    public static final ConfigKey<Double> GEOFENCE_POLYLINE_DISTANCE = new ConfigKey<>(
            "geofence.polylineDistance",
            Collections.singletonList(KeyType.GLOBAL),
            25.0);

    /**
     * Path to the database driver JAR file. Traccar includes drivers for MySQL, PostgreSQL and H2 databases. If you use
     * one of those, you don't need to specify this parameter.
     */
    public static final ConfigKey<String> DATABASE_DRIVER_FILE = new ConfigKey<>(
            "database.driverFile",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Database driver Java class. For H2 use 'org.h2.Driver'. MySQL driver class name is 'com.mysql.jdbc.Driver'.
     */
    public static final ConfigKey<String> DATABASE_DRIVER = new ConfigKey<>(
            "database.driver",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Database connection URL. By default Traccar uses H2 database.
     */
    public static final ConfigKey<String> DATABASE_URL = new ConfigKey<>(
            "database.url",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Database user name. Default administrator user for H2 database is 'sa'.
     */
    public static final ConfigKey<String> DATABASE_USER = new ConfigKey<>(
            "database.user",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Database user password. Default password for H2 admin (sa) user is empty.
     */
    public static final ConfigKey<String> DATABASE_PASSWORD = new ConfigKey<>(
            "database.password",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Path to Liquibase master changelog file.
     */
    public static final ConfigKey<String> DATABASE_CHANGELOG = new ConfigKey<>(
            "database.changelog",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * SQL query to check connection status. Default value is 'SELECT 1'. For Oracle database you can use
     * 'SELECT 1 FROM DUAL'.
     */
    public static final ConfigKey<String> DATABASE_CHECK_CONNECTION = new ConfigKey<>(
            "database.checkConnection",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Store original HEX or string data as "raw" attribute in the corresponding position.
     */
    public static final ConfigKey<Boolean> DATABASE_SAVE_ORIGINAL = new ConfigKey<>(
            "database.saveOriginal",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Default category for auto-registered devices.
     */
    public static final ConfigKey<String> DATABASE_REGISTER_UNKNOWN_DEFAULT_CATEGORY = new ConfigKey<>(
            "database.registerUnknown.defaultCategory",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * The group id assigned to auto-registered devices.
     */
    public static final ConfigKey<Long> DATABASE_REGISTER_UNKNOWN_DEFAULT_GROUP_ID = new ConfigKey<>(
            "database.registerUnknown.defaultGroupId",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Minimum device refresh timeout in seconds. Default timeout is 5 minutes.
     */
    public static final ConfigKey<Long> DATABASE_REFRESH_DELAY = new ConfigKey<>(
            "database.refreshDelay",
            Collections.singletonList(KeyType.GLOBAL),
            300L);

    /**
     * If no data is reported by a device for the given amount of time, status changes from online to unknown. Value is
     * in seconds. Default timeout is 10 minutes.
     */
    public static final ConfigKey<Long> STATUS_TIMEOUT = new ConfigKey<>(
            "status.timeout",
            Collections.singletonList(KeyType.GLOBAL),
            600L);

    /**
     * Optional parameter to specify network interface for web interface to bind to. By default server will bind to all
     * available interfaces.
     */
    public static final ConfigKey<String> WEB_ADDRESS = new ConfigKey<>(
            "web.address",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Web interface TCP port number. By default Traccar uses port 8082. To avoid specifying port in the browser you
     * can set it to 80 (default HTTP port).
     */
    public static final ConfigKey<Integer> WEB_PORT = new ConfigKey<>(
            "web.port",
            Collections.singletonList(KeyType.GLOBAL),
            8082);

    /**
     * WebSocket connection timeout in milliseconds. Default timeout is 10 minutes.
     */
    public static final ConfigKey<Long> WEB_TIMEOUT = new ConfigKey<>(
            "web.timeout",
            Collections.singletonList(KeyType.GLOBAL),
            60000L);

    /**
     * Enable positions forwarding to other web server.
     */
    public static final ConfigKey<Boolean> FORWARD_ENABLE = new ConfigKey<>(
            "forward.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * URL to forward positions. Data is passed through URL parameters. For example, {uniqueId} for device identifier,
     * {latitude} and {longitude} for coordinates.
     */
    public static final ConfigKey<String> FORWARD_URL = new ConfigKey<>(
            "forward.url",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Additional HTTP header, can be used for authorization.
     */
    public static final ConfigKey<String> FORWARD_HEADER = new ConfigKey<>(
            "forward.header",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Boolean value to enable forwarding in JSON format.
     */
    public static final ConfigKey<Boolean> FORWARD_JSON = new ConfigKey<>(
            "forward.json",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Boolean value to enable URL parameters in json mode. For example, {uniqueId} for device identifier,
     * {latitude} and {longitude} for coordinates.
     */
    public static final ConfigKey<Boolean> FORWARD_URL_VARIABLES = new ConfigKey<>(
            "forward.urlVariables",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Position forwarding retrying enable. When enabled, additional attempts are made to deliver positions. If initial
     * delivery fails, because of an unreachable server or an HTTP response different from '2xx', the software waits
     * for 'forward.retry.delay' milliseconds to retry delivery. On subsequent failures, this delay is duplicated.
     * If forwarding is retried for 'forward.retry.count', retrying is canceled and the position is dropped. Positions
     * pending to be delivered are limited to 'forward.retry.limit'. If this limit is reached, positions get discarded.
     */
    public static final ConfigKey<Boolean> FORWARD_RETRY_ENABLE = new ConfigKey<>(
            "forward.retry.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Position forwarding retry first delay in milliseconds.
     * Can be set to anything greater than 0. Defaults to 100 milliseconds.
     */
    public static final ConfigKey<Integer> FORWARD_RETRY_DELAY = new ConfigKey<>(
            "forward.retry.delay",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Position forwarding retry maximum retries.
     * Can be set to anything greater than 0. Defaults to 10 retries.
     */
    public static final ConfigKey<Integer> FORWARD_RETRY_COUNT = new ConfigKey<>(
            "forward.retry.count",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Position forwarding retry pending positions limit.
     * Can be set to anything greater than 0. Defaults to 100 positions.
     */
    public static final ConfigKey<Integer> FORWARD_RETRY_LIMIT = new ConfigKey<>(
            "forward.retry.limit",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Maximum time period for reports in seconds. Can be useful to prevent users to request unreasonably long reports.
     * By default there is no limit.
     */
    public static final ConfigKey<Long> REPORT_PERIOD_LIMIT = new ConfigKey<>(
            "report.periodLimit",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Trips less than minimal duration and minimal distance are ignored. 300 seconds and 500 meters are default.
     */
    public static final ConfigKey<Long> REPORT_TRIP_MINIMAL_TRIP_DISTANCE = new ConfigKey<>(
            "report.trip.minimalTripDistance",
            Collections.singletonList(KeyType.GLOBAL),
            500L);

    /**
     * Trips less than minimal duration and minimal distance are ignored. 300 seconds and 500 meters are default.
     */
    public static final ConfigKey<Long> REPORT_TRIP_MINIMAL_TRIP_DURATION = new ConfigKey<>(
            "report.trip.minimalTripDuration",
            Collections.singletonList(KeyType.GLOBAL),
            300L);

    /**
     * Parking less than minimal duration does not cut trip. Default 300 seconds.
     */
    public static final ConfigKey<Long> REPORT_TRIP_MINIMAL_PARKING_DURATION = new ConfigKey<>(
            "report.trip.minimalParkingDuration",
            Collections.singletonList(KeyType.GLOBAL),
            300L);

    /**
     * Gaps of more than specified time are counted as stops. Default value is one hour.
     */
    public static final ConfigKey<Long> REPORT_TRIP_MINIMAL_NO_DATA_DURATION = new ConfigKey<>(
            "report.trip.minimalNoDataDuration",
            Collections.singletonList(KeyType.GLOBAL),
            3600L);

    /**
     * Flag to enable ignition use for trips calculation.
     */
    public static final ConfigKey<Boolean> REPORT_TRIP_USE_IGNITION = new ConfigKey<>(
            "report.trip.useIgnition",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Boolean flag to enable or disable position filtering.
     */
    public static final ConfigKey<Boolean> FILTER_ENABLE = new ConfigKey<>(
            "filter.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Filter invalid (valid field is set to false) positions.
     */
    public static final ConfigKey<Boolean> FILTER_INVALID = new ConfigKey<>(
            "filter.invalid",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Filter zero coordinates. Zero latitude and longitude are theoretically valid values, but it practice it usually
     * indicates invalid GPS data.
     */
    public static final ConfigKey<Boolean> FILTER_ZERO = new ConfigKey<>(
            "filter.zero",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Filter duplicate records (duplicates are detected by time value).
     */
    public static final ConfigKey<Boolean> FILTER_DUPLICATE = new ConfigKey<>(
            "filter.duplicate",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Filter records with fix time in future. The values is specified in seconds. Records that have fix time more than
     * specified number of seconds later than current server time would be filtered out.
     */
    public static final ConfigKey<Long> FILTER_FUTURE = new ConfigKey<>(
            "filter.future",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Filter positions with accuracy less than specified value in meters.
     */
    public static final ConfigKey<Integer> FILTER_ACCURACY = new ConfigKey<>(
            "filter.accuracy",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Filter cell and wifi locations that are coming from geolocation provider.
     */
    public static final ConfigKey<Boolean> FILTER_APPROXIMATE = new ConfigKey<>(
            "filter.approximate",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Filter positions with exactly zero speed values.
     */
    public static final ConfigKey<Boolean> FILTER_STATIC = new ConfigKey<>(
            "filter.static",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Filter records by distance. The values is specified in meters. If the new position is less far than this value
     * from the last one it gets filtered out.
     */
    public static final ConfigKey<Integer> FILTER_DISTANCE = new ConfigKey<>(
            "filter.distance",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Filter records by Maximum Speed value in knots. Can be used to filter jumps to far locations even if they're
     * marked as valid. Shouldn't be too low. Start testing with values at about 25000.
     */
    public static final ConfigKey<Integer> FILTER_MAX_SPEED = new ConfigKey<>(
            "filter.maxSpeed",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Filter position if time from previous position is less than specified value in seconds.
     */
    public static final ConfigKey<Integer> FILTER_MIN_PERIOD = new ConfigKey<>(
            "filter.minPeriod",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Time limit for the filtering in seconds. If the time difference between last position and a new one is more than
     * this limit, the new position will not be filtered out.
     */
    public static final ConfigKey<Long> FILTER_SKIP_LIMIT = new ConfigKey<>(
            "filter.skipLimit",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Enable attributes skipping. Attribute skipping can be enabled in the config or device attributes.
     */
    public static final ConfigKey<Boolean> FILTER_SKIP_ATTRIBUTES_ENABLE = new ConfigKey<>(
            "filter.skipAttributes.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Override device time. Possible values are 'deviceTime' and 'serverTime'
     */
    public static final ConfigKey<String> TIME_OVERRIDE = new ConfigKey<>(
            "time.override",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * List of protocols for overriding time. If not specified override is applied globally. List consist of protocol
     * names that can be separated by comma or single space character.
     */
    public static final ConfigKey<String> TIME_PROTOCOLS = new ConfigKey<>(
            "time.protocols",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Replaces coordinates with last known if change is less than a 'coordinates.minError' meters
     * or more than a 'coordinates.maxError' meters. Helps to avoid coordinates jumps during parking period
     * or jumps to zero coordinates.
     */
    public static final ConfigKey<Boolean> COORDINATES_FILTER = new ConfigKey<>(
            "coordinates.filter",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Distance in meters. Distances below this value gets handled like explained in 'coordinates.filter'.
     */
    public static final ConfigKey<Integer> COORDINATES_MIN_ERROR = new ConfigKey<>(
            "coordinates.minError",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Distance in meters. Distances above this value gets handled like explained in 'coordinates.filter', but only if
     * Position is also marked as 'invalid'.
     */
    public static final ConfigKey<Integer> COORDINATES_MAX_ERROR = new ConfigKey<>(
            "coordinates.maxError",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Enable to save device IP addresses information. Disabled by default.
     */
    public static final ConfigKey<Boolean> PROCESSING_REMOTE_ADDRESS_ENABLE = new ConfigKey<>(
            "processing.remoteAddress.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Enable engine hours calculation on the server side. It uses ignition value to determine engine state.
     */
    public static final ConfigKey<Boolean> PROCESSING_ENGINE_HOURS_ENABLE = new ConfigKey<>(
            "processing.engineHours.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Enable copying of missing attributes from last position to the current one. Might be useful if device doesn't
     * send some values in every message.
     */
    public static final ConfigKey<Boolean> PROCESSING_COPY_ATTRIBUTES_ENABLE = new ConfigKey<>(
            "processing.copyAttributes.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Enable computed attributes processing.
     */
    public static final ConfigKey<Boolean> PROCESSING_COMPUTED_ATTRIBUTES_ENABLE = new ConfigKey<>(
            "processing.computedAttributes.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Enable computed attributes processing.
     */
    public static final ConfigKey<Boolean> PROCESSING_COMPUTED_ATTRIBUTES_DEVICE_ATTRIBUTES = new ConfigKey<>(
            "processing.computedAttributes.deviceAttributes",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Boolean flag to enable or disable reverse geocoder.
     */
    public static final ConfigKey<Boolean> GEOCODER_ENABLE = new ConfigKey<>(
            "geocoder.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Reverse geocoder type. Check reverse geocoding documentation for more info. By default (if the value is not
     * specified) server uses Google API.
     */
    public static final ConfigKey<String> GEOCODER_TYPE = new ConfigKey<>(
            "geocoder.type",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Geocoder server URL. Applicable only to Nominatim and Gisgraphy providers.
     */
    public static final ConfigKey<String> GEOCODER_URL = new ConfigKey<>(
            "geocoder.url",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * App id for use with Here provider.
     */
    public static final ConfigKey<String> GEOCODER_ID = new ConfigKey<>(
            "geocoder.id",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Provider API key. Most providers require API keys.
     */
    public static final ConfigKey<String> GEOCODER_KEY = new ConfigKey<>(
            "geocoder.key",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Language parameter for providers that support localization (e.g. Google and Nominatim).
     */
    public static final ConfigKey<String> GEOCODER_LANGUAGE = new ConfigKey<>(
            "geocoder.language",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Address format string. Default value is %h %r, %t, %s, %c. See AddressFormat for more info.
     */
    public static final ConfigKey<String> GEOCODER_FORMAT = new ConfigKey<>(
            "geocoder.format",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Cache size for geocoding results.
     */
    public static final ConfigKey<Integer> GEOCODER_CACHE_SIZE = new ConfigKey<>(
            "geocoder.cacheSize",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Disable automatic reverse geocoding requests for all positions.
     */
    public static final ConfigKey<Boolean> GEOCODER_IGNORE_POSITIONS = new ConfigKey<>(
            "geocoder.ignorePositions",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Boolean flag to apply reverse geocoding to invalid positions.
     */
    public static final ConfigKey<Boolean> GEOCODER_PROCESS_INVALID_POSITIONS = new ConfigKey<>(
            "geocoder.processInvalidPositions",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Optional parameter to specify minimum distance for new reverse geocoding request. If distance is less than
     * specified value (in meters), then Traccar will reuse last known address.
     */
    public static final ConfigKey<Integer> GEOCODER_REUSE_DISTANCE = new ConfigKey<>(
            "geocoder.reuseDistance",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Boolean flag to enable LBS location resolution. Some devices send cell towers information and WiFi point when GPS
     * location is not available. Traccar can determine coordinates based on that information using third party
     * services. Default value is false.
     */
    public static final ConfigKey<Boolean> GEOLOCATION_ENABLE = new ConfigKey<>(
            "geolocation.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Provider to use for LBS location. Available options: google, mozilla and opencellid. By default opencellid is
     * used. You have to supply a key that you get from corresponding provider. For more information see LBS geolocation
     * documentation.
     */
    public static final ConfigKey<String> GEOLOCATION_TYPE = new ConfigKey<>(
            "geolocation.type",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Geolocation provider API URL address. Not required for most providers.
     */
    public static final ConfigKey<String> GEOLOCATION_URL = new ConfigKey<>(
            "geolocation.url",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Provider API key. OpenCellID service requires API key.
     */
    public static final ConfigKey<String> GEOLOCATION_KEY = new ConfigKey<>(
            "geolocation.key",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Boolean flag to apply geolocation to invalid positions.
     */
    public static final ConfigKey<Boolean> GEOLOCATION_PROCESS_INVALID_POSITIONS = new ConfigKey<>(
            "geolocation.processInvalidPositions",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Boolean flag to enable speed limit API to get speed limit values depending on location. Default value is false.
     */
    public static final ConfigKey<Boolean> SPEED_LIMIT_ENABLE = new ConfigKey<>(
            "speedLimit.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Provider to use for speed limit. Available options: overpass. By default overpass is used.
     */
    public static final ConfigKey<String> SPEED_LIMIT_TYPE = new ConfigKey<>(
            "speedLimit.type",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Speed limit provider API URL address.
     */
    public static final ConfigKey<String> SPEED_LIMIT_URL = new ConfigKey<>(
            "speedLimit.url",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Override latitude sign / hemisphere. Useful in cases where value is incorrect because of device bug. Value can be
     * N for North or S for South.
     */
    public static final ConfigKey<String> LOCATION_LATITUDE_HEMISPHERE = new ConfigKey<>(
            "location.latitudeHemisphere",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Override longitude sign / hemisphere. Useful in cases where value is incorrect because of device bug. Value can
     * be E for East or W for West.
     */
    public static final ConfigKey<String> LOCATION_LONGITUDE_HEMISPHERE = new ConfigKey<>(
            "location.longitudeHemisphere",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Enable Jetty Request Log.
     */
    public static final ConfigKey<Boolean> WEB_REQUEST_LOG_ENABLE = new ConfigKey<>(
            "web.requestLog.enable",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Jetty Request Log Path.
     * The path must include the string "yyyy_mm_dd", which is replaced with the actual date when creating and rolling
     * over the file.
     * Example: ./logs/jetty-yyyy_mm_dd.request.log
     */
    public static final ConfigKey<String> WEB_REQUEST_LOG_PATH = new ConfigKey<>(
            "web.requestLog.path",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Set the number of days before rotated request log files are deleted.
     */
    public static final ConfigKey<Integer> WEB_REQUEST_LOG_RETAIN_DAYS = new ConfigKey<>(
            "web.requestLog.retainDays",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Disable systemd health checks.
     */
    public static final ConfigKey<Boolean> WEB_DISABLE_HEALTH_CHECK = new ConfigKey<>(
            "web.disableHealthCheck",
            Collections.singletonList(KeyType.GLOBAL));

    /**
     * Sets SameSite cookie attribute value.
     * Supported options: Lax, Strict, None.
     */
    public static final ConfigKey<String> WEB_SAME_SITE_COOKIE = new ConfigKey<>(
            "web.sameSiteCookie",
            Collections.singletonList(KeyType.GLOBAL));

    private Keys() {
    }

}
