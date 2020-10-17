package net.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.model.Product;
import net.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void getProduct() {
		try {
			URL url = new URL("https://e3519ce8d2b72750210800f3ba7115f2:a87522cc2e2551e43549aceb52e5d141@securecod4.myshopify.com/admin/api/2020-01/products.json");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-Shopify-Access-Token", "a87522cc2e2551e43549aceb52e5d141");
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestProperty("Accept", "application/json");
			con.setDoOutput(true);
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"))) {
					    StringBuilder response = new StringBuilder();
					    String responseLine = null;
					    while ((responseLine = br.readLine()) != null) {
					        response.append(responseLine.trim());
					    }
//					    System.out.println(response.toString());
					    
					    JSONObject jsonObject = new JSONObject(response.toString());
					    JSONArray jArray = (JSONArray) jsonObject.get("products");

					    for(int i = 0; i < jArray.length(); i++) {
					    	JSONObject tempObject = jArray.getJSONObject(i);
					    	Product product = new Product();
					    	product.setId(tempObject.getLong("id"));
					    	product.setTitle(tempObject.optString("title"));
					    	product.setVendor(tempObject.optString("vendor"));
					    	product.setBody_html(tempObject.optString("body_html"));
					    	product.setProduct_type(tempObject.optString("product_type"));
					    	product.setCreated_at(tempObject.optString("created_at"));
					    	product.setHandle(tempObject.optString("handle"));
					    	product.setUpdated_at(tempObject.optString("updated_at"));
					    	product.setPublished_at(tempObject.optString("published_at"));
					    	product.setTemplate_suffix(tempObject.optString("template_suffix"));
					    	product.setPublished_scope(tempObject.optString("published_scope"));
					    	product.setTags(tempObject.optString("tags"));
					    	product.setAdmin_graphical_api_id(tempObject.optString("admin_graphical_api_id"));
					    	
					    	this.productRepository.save(product);
					    }
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	 

	 
}
