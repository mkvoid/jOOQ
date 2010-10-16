/**
 * This class is generated by jOOQ
 */
package org.jooq.test.mysql.generatedclasses.tables;


import org.jooq.SQLDialect;
import org.jooq.TableField;
import org.jooq.impl.TableFieldImpl;
import org.jooq.impl.TableImpl;
import org.jooq.test.mysql.generatedclasses.Test;
import org.jooq.test.mysql.generatedclasses.tables.records.VLibraryRecord;


/**
 * This class is generated by jOOQ.
 *
 * VIEW
 */
public class VLibrary extends TableImpl<VLibraryRecord> {

	private static final long serialVersionUID = 1L;

	/**
	 * The singleton instance of v_library
	 */
	public static final VLibrary V_LIBRARY = new VLibrary();

	/**
	 * The class holding records for this table
	 */
	private static final Class<VLibraryRecord> RECORD_TYPE = VLibraryRecord.class;

	/**
	 * The class holding records for this table
	 */
	@Override
	public Class<VLibraryRecord> getRecordType() {
		return RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 */
	public static final TableField<VLibraryRecord, String> AUTHOR = new TableFieldImpl<VLibraryRecord, String>(SQLDialect.MYSQL, "AUTHOR", String.class, V_LIBRARY);

	/**
	 * The book's title
	 */
	public static final TableField<VLibraryRecord, String> TITLE = new TableFieldImpl<VLibraryRecord, String>(SQLDialect.MYSQL, "TITLE", String.class, V_LIBRARY);

	/**
	 * No further instances allowed
	 */
	private VLibrary() {
		super(SQLDialect.MYSQL, "v_library", Test.TEST);
	}

}
