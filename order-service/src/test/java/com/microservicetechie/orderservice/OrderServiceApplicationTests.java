//package com.microservicetechie.orderservice;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.microservicetechie.orderservice.dto.OrderLineItemsDto;
//import com.microservicetechie.orderservice.dto.OrderRequest;
//import com.microservicetechie.orderservice.model.Order;
//import com.microservicetechie.orderservice.model.OrderLineItems;
//import com.microservicetechie.orderservice.repository.OrderRepository;
//import lombok.RequiredArgsConstructor;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.DynamicPropertyRegistry;
//import org.springframework.test.context.DynamicPropertySource;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.testcontainers.containers.MySQLContainer;
//import org.testcontainers.junit.jupiter.Container;
//import org.testcontainers.junit.jupiter.Testcontainers;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.UUID;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
//class OrderServiceApplicationTests {
//	@Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ObjectMapper objectMapper;
//	@Autowired
//	private OrderRepository orderRepository;
//
//	@Container
//	static MySQLContainer<?> mySQLContainer = new MySQLContainer<>("mysql:latest");
//
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry) {
//		dynamicPropertyRegistry.add("spring.datasource.url", mySQLContainer::getJdbcUrl);
//		dynamicPropertyRegistry.add("spring.datasource.username", mySQLContainer::getUsername);
//		dynamicPropertyRegistry.add("spring.datasource.password", mySQLContainer::getPassword);
//		dynamicPropertyRegistry.add("spring.jpa.hibernate.ddl-auto",() -> "update");
//		dynamicPropertyRegistry.add("server.port",() -> "8081");
//	}
//
//	@Test
//	void shouldCreateOrder() throws Exception {
////		mockMvc.perform(MockMvcRequestBuilders.post("/api/order")
////				.contentType(MediaType.APPLICATION_JSON)
////				.content())
////				.andExpect(status().isCreated());
////        Assertions.assertEquals(1, orderRepository.findAll().size());
//	}
//
//	private void getOrderRequest() {
//		//
//	}
//
//}
