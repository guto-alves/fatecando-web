package com.gutotech.fatecando.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.validation.constraints.NotBlank;

public class Discipline {
	private Long id;

	@NotBlank
	private String name;

	@NotBlank
	private String code;

	@NotBlank
	private String description;

	@NotBlank
	private String objective;

	private int semester;

	private long likes;

	private Set<Topic> topics = new HashSet<>();

	private List<ForumTopic> forum = new ArrayList<>();

	private Course course;

	private UserInfo user;

	public Discipline() {
	}

	public Discipline(String name, String code, String description, String objetive, int semester) {
		this.name = name;
		this.code = code;
		this.description = description;
		this.objective = objetive;
		this.semester = semester;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getObjective() {
		return objective;
	}

	public void setObjective(String objective) {
		this.objective = objective;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public long getLikes() {
		return likes;
	}

	public void setLikes(long likes) {
		this.likes = likes;
	}

	public Set<Topic> getTopics() {
		return topics;
	}

	public List<ForumTopic> getForum() {
		return forum;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Discipline)) {
			return false;
		}
		Discipline other = (Discipline) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Discipline [id=" + id + ", name=" + name + ", code=" + code + "]";
	}

	public class UserInfo {
		private Date accessDate;

		private boolean liked;

		private int progress;

		public UserInfo() {
		}

		public Date getAccessDate() {
			return accessDate;
		}

		public void setAccessDate(Date accessDate) {
			this.accessDate = accessDate;
		}

		public boolean isLiked() {
			return liked;
		}

		public void setLiked(boolean liked) {
			this.liked = liked;
		}

		public int getProgress() {
			return progress;
		}

		public void setProgress(int progress) {
			this.progress = progress;
		}
	}

}
