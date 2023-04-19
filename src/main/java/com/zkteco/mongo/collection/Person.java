package com.zkteco.mongo.collection;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "person")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {

	@Id
	private String id;
	private String firstName;
	private String lastName;
	private int age;
	private List<String> hobbies;
	private List<Address> addresses;

}
