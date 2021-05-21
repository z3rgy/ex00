package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*Setter 주입
@Setter(onMethod_ = {@Autowired})
private Chef chef;*/

/*생성자 주입
@AllArgsConstructor
private Chef chef;
*/

/*필드 주입
@Autowired
private Chef chef;
*/

/*final 필드 주입
@RequiredArgsConstructor
private final Chef chef*/

@Component
@ToString
@RequiredArgsConstructor
public class Restaurant {
	
	private final Chef chef;
}
