//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package org.flowable.dmn.engine.impl.db;

import org.flowable.common.engine.impl.db.EngineDatabaseConfiguration;
import org.flowable.common.engine.impl.db.LiquibaseBasedSchemaManager;
import org.flowable.common.engine.impl.db.LiquibaseDatabaseConfiguration;
import org.flowable.common.engine.impl.db.SchemaManager;
import org.flowable.dmn.engine.DmnEngineConfiguration;
import org.flowable.dmn.engine.impl.util.CommandContextUtil;

public class DmnDbSchemaManager extends LiquibaseBasedSchemaManager {
//    public static final String LIQUIBASE_CHANGELOG="classpath:org/flowable/dmn/db/liquibase/flowable-cus-dmn-db-changelog.xml";
      public static final String LIQUIBASE_CHANGELOG="org/flowable/dmn/db/liquibase/flowable-cus-dmn-db-changelog.xml";

    public DmnDbSchemaManager() {
//        super("dmn", LIQUIBASE_CHANGELOG, "ACT_DMN_");`
        super("dmn", LIQUIBASE_CHANGELOG, DmnEngineConfiguration.LIQUIBASE_CHANGELOG_PREFIX);
    }

    protected LiquibaseDatabaseConfiguration getDatabaseConfiguration() {
        return new EngineDatabaseConfiguration(CommandContextUtil.getDmnEngineConfiguration());
    }

    public void initSchema() {
        this.initSchema(CommandContextUtil.getDmnEngineConfiguration().getDatabaseSchemaUpdate());
    }

    public void schemaCreate() {
        this.getCommonSchemaManager().schemaCreate();
        super.schemaCreate();
    }

    public void schemaDrop() {
        try {
            super.schemaDrop();
        } catch (Exception var3) {
            this.logger.info("Error dropping dmn engine tables", var3);
        }

        try {
            this.getCommonSchemaManager().schemaDrop();
        } catch (Exception var2) {
            this.logger.info("Error dropping common tables", var2);
        }

    }

    public String schemaUpdate() {
        this.getCommonSchemaManager().schemaUpdate();
        return super.schemaUpdate();
    }

    protected SchemaManager getCommonSchemaManager() {
        return CommandContextUtil.getDmnEngineConfiguration().getCommonSchemaManager();
    }
}
