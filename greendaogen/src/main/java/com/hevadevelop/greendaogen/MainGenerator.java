package com.hevadevelop.greendaogen;

import de.greenrobot.daogenerator.Schema;

public class MainGenerator {
    public static void main(String args[]) {
        Integer version = BuildConfig.SCHEMA_VERSION;
        Schema schema = new Schema(version, "com.hevadevelop.key_funds.DatabaseLocal");
        schema.enableKeepSectionsByDefault();

        addTables(schema);
    }

    private static void addTables(Schema schema) {
    }
}
