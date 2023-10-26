package com.uap.it311l.registrationapi2.repository;

//import com.uap.it311l.registrationapi.model.Attendee;
import com.uap.it311l.registrationapi2.model.Attendee;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.ArrayList;

@Mapper
public interface RegistrationMybatisRepository {

	@Insert("INSERT INTO attendees(firstName, middleName, lastName, course, age, surveyEligibilityTag) VALUES (#{firstName}, #{middleName}, #{lastName}, #{course}, #{age}, #{surveyEligibilityTag} )")
	public int insert(Attendee attendee);

	@Select("Select * from attendees")
	public ArrayList<Attendee> findAll();

	@Update("Update attendees set surveyEligibilityTag=#{surveyEligibilityTag} where attendeeId =#{attendeeId}")
	public void updateTag(Attendee attendee);

	@Delete("Delete from attendees where attendeeId = #{attendeeId}")
	public void deleteAttendee(int attendeeId);
}
