/*
 * Copyright 2007-2010 JadaSite.

 * This file is part of JadaSite.
 
 * JadaSite is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.

 * JadaSite is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.

 * You should have received a copy of the GNU General Public License
 * along with JadaSite.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jada.jpa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ItemAttributeDetail generated by hbm2java
 */
@Entity
@Table(name = "item_attrib_detail")
public class ItemAttributeDetail implements java.io.Serializable {

	private static final long serialVersionUID = -8515265039807943734L;
	private Long itemAttribDetailId;
	private String recUpdateBy;
	private Date recUpdateDatetime;
	private String recCreateBy;
	private Date recCreateDatetime;
	private ItemAttributeDetailLanguage itemAttributeDetailLanguage;
	private Set<ItemAttributeDetailLanguage> itemAttributeDetailLanguages = new HashSet<ItemAttributeDetailLanguage>(
			0);
	private Item item;
	private CustomAttributeDetail customAttributeDetail;
	private CustomAttributeOption customAttributeOption;

	public ItemAttributeDetail() {
	}

	public ItemAttributeDetail(String recUpdateBy, Date recUpdateDatetime,
			String recCreateBy, Date recCreateDatetime) {
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
	}

	public ItemAttributeDetail(String recUpdateBy, Date recUpdateDatetime,
			String recCreateBy, Date recCreateDatetime,
			ItemAttributeDetailLanguage itemAttributeDetailLanguage,
			Set<ItemAttributeDetailLanguage> itemAttributeDetailLanguages,
			Item item, CustomAttributeDetail customAttributeDetail,
			CustomAttributeOption customAttributeOption) {
		this.recUpdateBy = recUpdateBy;
		this.recUpdateDatetime = recUpdateDatetime;
		this.recCreateBy = recCreateBy;
		this.recCreateDatetime = recCreateDatetime;
		this.itemAttributeDetailLanguage = itemAttributeDetailLanguage;
		this.itemAttributeDetailLanguages = itemAttributeDetailLanguages;
		this.item = item;
		this.customAttributeDetail = customAttributeDetail;
		this.customAttributeOption = customAttributeOption;
	}

	@Id
	@GeneratedValue
	@Column(name = "item_attrib_detail_id", nullable = false)
	public Long getItemAttribDetailId() {
		return this.itemAttribDetailId;
	}

	public void setItemAttribDetailId(Long itemAttribDetailId) {
		this.itemAttribDetailId = itemAttribDetailId;
	}

	@Column(name = "rec_update_by", nullable = false, length = 20)
	public String getRecUpdateBy() {
		return this.recUpdateBy;
	}

	public void setRecUpdateBy(String recUpdateBy) {
		this.recUpdateBy = recUpdateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rec_update_datetime", nullable = false)
	public Date getRecUpdateDatetime() {
		return this.recUpdateDatetime;
	}

	public void setRecUpdateDatetime(Date recUpdateDatetime) {
		this.recUpdateDatetime = recUpdateDatetime;
	}

	@Column(name = "rec_create_by", nullable = false, length = 20)
	public String getRecCreateBy() {
		return this.recCreateBy;
	}

	public void setRecCreateBy(String recCreateBy) {
		this.recCreateBy = recCreateBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "rec_create_datetime", nullable = false)
	public Date getRecCreateDatetime() {
		return this.recCreateDatetime;
	}

	public void setRecCreateDatetime(Date recCreateDatetime) {
		this.recCreateDatetime = recCreateDatetime;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_attrib_detail_lang_id")
	public ItemAttributeDetailLanguage getItemAttributeDetailLanguage() {
		return this.itemAttributeDetailLanguage;
	}

	public void setItemAttributeDetailLanguage(
			ItemAttributeDetailLanguage itemAttributeDetailLanguage) {
		this.itemAttributeDetailLanguage = itemAttributeDetailLanguage;
	}

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_attrib_detail_id", updatable = false)
	public Set<ItemAttributeDetailLanguage> getItemAttributeDetailLanguages() {
		return this.itemAttributeDetailLanguages;
	}

	public void setItemAttributeDetailLanguages(
			Set<ItemAttributeDetailLanguage> itemAttributeDetailLanguages) {
		this.itemAttributeDetailLanguages = itemAttributeDetailLanguages;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_id")
	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "custom_attrib_detail_id")
	public CustomAttributeDetail getCustomAttributeDetail() {
		return this.customAttributeDetail;
	}

	public void setCustomAttributeDetail(
			CustomAttributeDetail customAttributeDetail) {
		this.customAttributeDetail = customAttributeDetail;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "custom_attrib_option_id")
	public CustomAttributeOption getCustomAttributeOption() {
		return this.customAttributeOption;
	}

	public void setCustomAttributeOption(
			CustomAttributeOption customAttributeOption) {
		this.customAttributeOption = customAttributeOption;
	}

}