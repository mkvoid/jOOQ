/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TInheritance_1_1 implements org.jooq.test.postgres.generatedclasses.tables.interfaces.ITInheritance_1_1 {

	private static final long serialVersionUID = -1799156816;

	private final java.lang.String text_1;
	private final java.lang.String text_1_1;

	public TInheritance_1_1(
		java.lang.String text_1,
		java.lang.String text_1_1
	) {
		this.text_1 = text_1;
		this.text_1_1 = text_1_1;
	}

	@Override
	public java.lang.String getText_1() {
		return this.text_1;
	}

	@Override
	public java.lang.String getText_1_1() {
		return this.text_1_1;
	}
}
