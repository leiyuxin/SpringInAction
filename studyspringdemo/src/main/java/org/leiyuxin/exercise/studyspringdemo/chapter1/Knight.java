package org.leiyuxin.exercise.studyspringdemo.chapter1;

import org.springframework.beans.factory.BeanFactory;

import com.mysql.cj.jdbc.Driver;

/*import org.springframework.jdbc.core.JdbcTemplate;*/

public interface Knight {
	public default void embarkOnQuest() {
		System.out.println("default knight");
		/*new JdbcTemplate().queryForObject(sql, rowMapper, args);*/


	}
}
