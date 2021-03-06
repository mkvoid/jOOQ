/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.h2.matchers.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T_2718Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.h2.matchers.tables.records.T_2718Record> implements org.jooq.Record2<java.lang.Integer, java.lang.Integer>, org.jooq.examples.h2.matchers.tables.interfaces.IT_2718 {

	private static final long serialVersionUID = 2034813845;

	/**
	 * Setter for <code>PUBLIC.T_2718.EXCLUDE_ME</code>. 
	 */
	@Override
	public void setExcludeMe(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_2718.EXCLUDE_ME</code>. 
	 */
	@Override
	public java.lang.Integer getExcludeMe() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>PUBLIC.T_2718.XX</code>. 
	 */
	@Override
	public void setXx(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>PUBLIC.T_2718.XX</code>. 
	 */
	@Override
	public java.lang.Integer getXx() {
		return (java.lang.Integer) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.Integer> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.examples.h2.matchers.tables.T_2718.EXCLUDE_ME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return org.jooq.examples.h2.matchers.tables.T_2718.XX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getExcludeMe();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getXx();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(org.jooq.examples.h2.matchers.tables.interfaces.IT_2718 from) {
		setExcludeMe(from.getExcludeMe());
		setXx(from.getXx());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends org.jooq.examples.h2.matchers.tables.interfaces.IT_2718> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached T_2718Record
	 */
	public T_2718Record() {
		super(org.jooq.examples.h2.matchers.tables.T_2718.T_2718);
	}

	/**
	 * Create a detached, initialised T_2718Record
	 */
	public T_2718Record(java.lang.Integer excludeMe, java.lang.Integer xx) {
		super(org.jooq.examples.h2.matchers.tables.T_2718.T_2718);

		setValue(0, excludeMe);
		setValue(1, xx);
	}
}
