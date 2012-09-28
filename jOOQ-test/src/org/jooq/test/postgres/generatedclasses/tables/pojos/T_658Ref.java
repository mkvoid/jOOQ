/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.persistence.Entity
@javax.persistence.Table(name = "t_658_ref", schema = "public")
public class T_658Ref implements java.io.Serializable {

	private static final long serialVersionUID = -97181446;

	private final org.jooq.test.postgres.generatedclasses.enums.T_658_11 ref_11;
	private final org.jooq.test.postgres.generatedclasses.enums.T_658_21 ref_21;
	private final org.jooq.test.postgres.generatedclasses.enums.T_658_31 ref_31;
	private final org.jooq.test.postgres.generatedclasses.enums.T_658_12 ref_12;
	private final org.jooq.test.postgres.generatedclasses.enums.T_658_22 ref_22;
	private final org.jooq.test.postgres.generatedclasses.enums.T_658_32 ref_32;

	public T_658Ref(
		org.jooq.test.postgres.generatedclasses.enums.T_658_11 ref_11,
		org.jooq.test.postgres.generatedclasses.enums.T_658_21 ref_21,
		org.jooq.test.postgres.generatedclasses.enums.T_658_31 ref_31,
		org.jooq.test.postgres.generatedclasses.enums.T_658_12 ref_12,
		org.jooq.test.postgres.generatedclasses.enums.T_658_22 ref_22,
		org.jooq.test.postgres.generatedclasses.enums.T_658_32 ref_32
	) {
		this.ref_11 = ref_11;
		this.ref_21 = ref_21;
		this.ref_31 = ref_31;
		this.ref_12 = ref_12;
		this.ref_22 = ref_22;
		this.ref_32 = ref_32;
	}

	@javax.persistence.Column(name = "ref_11", length = 3)
	public org.jooq.test.postgres.generatedclasses.enums.T_658_11 getRef_11() {
		return this.ref_11;
	}

	@javax.persistence.Column(name = "ref_21", precision = 32)
	public org.jooq.test.postgres.generatedclasses.enums.T_658_21 getRef_21() {
		return this.ref_21;
	}

	@javax.persistence.Column(name = "ref_31", precision = 64)
	public org.jooq.test.postgres.generatedclasses.enums.T_658_31 getRef_31() {
		return this.ref_31;
	}

	@javax.persistence.Column(name = "ref_12", length = 3)
	public org.jooq.test.postgres.generatedclasses.enums.T_658_12 getRef_12() {
		return this.ref_12;
	}

	@javax.persistence.Column(name = "ref_22", precision = 32)
	public org.jooq.test.postgres.generatedclasses.enums.T_658_22 getRef_22() {
		return this.ref_22;
	}

	@javax.persistence.Column(name = "ref_32", precision = 64)
	public org.jooq.test.postgres.generatedclasses.enums.T_658_32 getRef_32() {
		return this.ref_32;
	}
}