/**
 * This class is generated by jOOQ
 */
package org.jooq.util.mysql.information_schema.tables;


import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.util.mysql.information_schema.InformationSchema;
import org.jooq.util.mysql.information_schema.tables.records.KeyColumnUsageRecord;


/**
 * This class is generated by jOOQ.
 */
public class KeyColumnUsage extends TableImpl<KeyColumnUsageRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of KEY_COLUMN_USAGE
	 */
	public static final KeyColumnUsage KEY_COLUMN_USAGE = new KeyColumnUsage();

	/**
	 * The class holding records for this table
	 */
	private static final Class<KeyColumnUsageRecord> RECORD_TYPE = KeyColumnUsageRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<KeyColumnUsageRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> CONSTRAINT_CATALOG = new TableFieldImpl<KeyColumnUsageRecord, String>(SQLDialect.MYSQL, "CONSTRAINT_CATALOG", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> CONSTRAINT_SCHEMA = new TableFieldImpl<KeyColumnUsageRecord, String>(SQLDialect.MYSQL, "CONSTRAINT_SCHEMA", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> CONSTRAINT_NAME = new TableFieldImpl<KeyColumnUsageRecord, String>(SQLDialect.MYSQL, "CONSTRAINT_NAME", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> TABLE_CATALOG = new TableFieldImpl<KeyColumnUsageRecord, String>(SQLDialect.MYSQL, "TABLE_CATALOG", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> TABLE_SCHEMA = new TableFieldImpl<KeyColumnUsageRecord, String>(SQLDialect.MYSQL, "TABLE_SCHEMA", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> TABLE_NAME = new TableFieldImpl<KeyColumnUsageRecord, String>(SQLDialect.MYSQL, "TABLE_NAME", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> COLUMN_NAME = new TableFieldImpl<KeyColumnUsageRecord, String>(SQLDialect.MYSQL, "COLUMN_NAME", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, Integer> ORDINAL_POSITION = new TableFieldImpl<KeyColumnUsageRecord, Integer>(SQLDialect.MYSQL, "ORDINAL_POSITION", Integer.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, Integer> POSITION_IN_UNIQUE_CONSTRAINT = new TableFieldImpl<KeyColumnUsageRecord, Integer>(SQLDialect.MYSQL, "POSITION_IN_UNIQUE_CONSTRAINT", Integer.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> REFERENCED_TABLE_SCHEMA = new TableFieldImpl<KeyColumnUsageRecord, String>(SQLDialect.MYSQL, "REFERENCED_TABLE_SCHEMA", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> REFERENCED_TABLE_NAME = new TableFieldImpl<KeyColumnUsageRecord, String>(SQLDialect.MYSQL, "REFERENCED_TABLE_NAME", String.class, KEY_COLUMN_USAGE);

	/**
	 * An uncommented item
	 */
	public static final TableField<KeyColumnUsageRecord, String> REFERENCED_COLUMN_NAME = new TableFieldImpl<KeyColumnUsageRecord, String>(SQLDialect.MYSQL, "REFERENCED_COLUMN_NAME", String.class, KEY_COLUMN_USAGE);

	/**
	 * No further instances allowed
	 */
	private KeyColumnUsage() {
		super(SQLDialect.MYSQL, "KEY_COLUMN_USAGE", InformationSchema.INFORMATION_SCHEMA);
	}

}
