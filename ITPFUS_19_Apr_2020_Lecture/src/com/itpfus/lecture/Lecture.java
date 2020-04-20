package com.itpfus.lecture;

import java.util.Date;

public class Lecture {
	public String topic;
	public String speaker;
	public Date date;

	public Lecture(String topic, String lectureSpeaker, Date lectureDate) {
		this.topic = topic;
		this.speaker = lectureSpeaker;
		this.date = lectureDate;
	}

}
