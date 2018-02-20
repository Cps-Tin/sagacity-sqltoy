/**
 *@Generated by QuickVO Tools 1.5 
 */
package org.sagacity.sqltoy.demo.vo;

import java.util.Date;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;
import org.sagacity.sqltoy.demo.vo.base.AbstractPkSequenceVO;

/**
 * @project sqltoy-orm
 * @author chenrenfei@lakala.com
 * @version 1.0.0
 * SEQ主键测试表  		
 * PkSequenceVO generated by TEST_PK_SEQUENCE
 */
@SqlToyEntity
public class PkSequenceVO extends AbstractPkSequenceVO {	
	/** default constructor */
	public PkSequenceVO() {
		super();
	}
	
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public PkSequenceVO(Integer id)
	{
		this.id=id;
	}

	/** minimal constructor */
	public PkSequenceVO(Integer id,String name)
	{
		this.id=id;
		this.name=name;
	}

	/** full constructor */
	public PkSequenceVO(Integer id,String name,Date createTime,Double sallary)
	{
		this.id=id;
		this.name=name;
		this.createTime=createTime;
		this.sallary=sallary;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	
	/**
     *@todo vo columns to String
     */
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	public PkSequenceVO clone() {
		try {
			// TODO Auto-generated method stub
			return (PkSequenceVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}