package ninja.eivind.hotsuploader.versions.migrations;

public @interface Migration {

    long fromVersion = 0L;

    long toVersion = Long.MAX_VALUE;
}