package com.uap.it311l.registrationapi2.model;

public class Attendee {
	
	protected String attendeeId;
	protected String firstName;
	protected String middleName;
	protected String lastName;
	protected String course;

	protected Boolean surveyEligibilityTag;

	public void setSurveyEligibilityTag(Boolean surveyEligibilityTag) {
		this.surveyEligibilityTag = surveyEligibilityTag;
	}

	protected int age;

	@Override
	public String toString() {
		return "Attendee{" +
				"attendeeId='" + attendeeId + '\'' +
				", firstName='" + firstName + '\'' +
				", middleName='" + middleName + '\'' +
				", lastName='" + lastName + '\'' +
				", course='" + course + '\'' +
				", surveyEligibilityTag=" + surveyEligibilityTag +
				", age=" + age +
				'}';
	}

	public Boolean getSurveyEligibilityTag() {
		return surveyEligibilityTag;
	}

	public String getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(String attendeeId) {
		this.attendeeId = attendeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
