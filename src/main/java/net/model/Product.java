package net.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@Column(name = "id")
	private long id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "body_html", columnDefinition="text")
	private String body_html;
	
	@Column(name = "vendor")
	private String vendor;
	
	@Column(name = "product_type")
	private String product_type;
	
	@Column(name = "created_at")
	private String created_at;
	
	@Column(name = "handle")
	private String handle;
	
	@Column(name = "updated_at")
	private String updated_at;
	
	@Column(name = "published_at")
	private String published_at;
	
	@Column(name = "template_suffix")
	private String template_suffix;
	
	@Column(name = "published_scope")
	private String published_scope;
	
	@Column(name = "tags", columnDefinition="text")
	private String tags;
	
	@Column(name = "admin_graphical_api_id")
	private String admin_graphical_api_id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody_html() {
		return body_html;
	}

	public void setBody_html(String body_html) {
		this.body_html = body_html;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getProduct_type() {
		return product_type;
	}

	public void setProduct_type(String product_type) {
		this.product_type = product_type;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public String getPublished_at() {
		return published_at;
	}

	public void setPublished_at(String published_at) {
		this.published_at = published_at;
	}

	public String getTemplate_suffix() {
		return template_suffix;
	}

	public void setTemplate_suffix(String template_suffix) {
		this.template_suffix = template_suffix;
	}

	public String getPublished_scope() {
		return published_scope;
	}

	public void setPublished_scope(String published_scope) {
		this.published_scope = published_scope;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public String getAdmin_graphical_api_id() {
		return admin_graphical_api_id;
	}

	public void setAdmin_graphical_api_id(String admin_graphical_api_id) {
		this.admin_graphical_api_id = admin_graphical_api_id;
	}
	
	
}
