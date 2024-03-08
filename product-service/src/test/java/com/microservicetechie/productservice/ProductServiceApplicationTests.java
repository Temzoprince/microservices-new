//package com.microservicetechie.productservice;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.microservicetechie.productservice.dto.ProductRequest;
//import com.microservicetechie.productservice.dto.ProductResponse;
//import com.microservicetechie.productservice.model.Product;
//import com.microservicetechie.productservice.repository.ProductRepository;
//import com.mongodb.assertions.Assertions;
////import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
////import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
////import org.springframework.test.context.DynamicPropertyRegistry;
////import org.springframework.test.context.DynamicPropertySource;
////import org.springframework.test.web.servlet.MockMvc;
////import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
////import org.testcontainers.containers.MongoDBContainer;
////import org.testcontainers.junit.jupiter.Container;
////import org.testcontainers.junit.jupiter.Testcontainers;
//
//import javax.print.attribute.standard.Media;
//import java.math.BigDecimal;
//import java.util.List;
//
////import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
//class ProductServiceApplicationTests {
//
//	@Container
//	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ObjectMapper objectMapper;
//	@Autowired
//	private ProductRepository productRepository;
//
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//		dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//	}
//
//	@Test
//	void shouldCreateProduct() throws Exception {
//		ProductRequest productRequest = getProductRequest();
//		String productRequestString = objectMapper.writeValueAsString(productRequest);
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//						.contentType(MediaType.APPLICATION_JSON)
//						.content(productRequestString))
//				.andExpect(status().isCreated());
//		Assertions.assertTrue(productRepository.findAll().size() == 1);
//	}
//
//	private ProductRequest getProductRequest() {
//		return ProductRequest.builder()
//				.name("Iphone 13")
//				.description("Iphone 13")
//				.price(BigDecimal.valueOf(1200))
//				.build();
//	}
//
//	@Test
//	void shouldGetAllProducts() throws Exception {
//		List<ProductResponse> productResponses = getProductResponse();
//		String productResponsesString = objectMapper.writeValueAsString(productResponses);
//		mockMvc.perform(MockMvcRequestBuilders.get("/api/product")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(productResponsesString))
//				.andExpect(status().isOk());
//		Assertions.assertTrue(productRepository.findAll().size() == productResponses.size());
//	}
//
//	private List<ProductResponse> getProductResponse() {
//		List<Product> products = productRepository.findAll();
//
//		return products.stream().map(this::mapToProductResponse).toList();
//	}
//
//	private ProductResponse mapToProductResponse(Product product) {
//		return ProductResponse.builder()
//				.id(product.getId())
//				.name(product.getName())
//				.description(product.getDescription())
//				.price(product.getPrice())
//				.build();
//	}
//
//}
