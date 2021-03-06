package com.cybage.service;

import java.sql.SQLException;
import java.util.List;

import com.cybage.dao.AdminDaoImplements;
import com.cybage.model.Category;
import com.cybage.model.Course;
import com.cybage.model.Video;

public class AdminServiceImplements implements AdminServiceInterface {
	private AdminDaoImplements ad;

	public AdminServiceImplements(AdminDaoImplements ad) {
		super();
		this.ad = ad;
	}

	public int addCourse(Course c,int category_id) throws Exception {
		// TODO Auto-generated method stub
		return ad.addCourse(c,category_id);
	}

	public boolean deleteCourse(int id) throws Exception {
		// TODO Auto-generated method stub
		return ad.deleteCourse(id);
	}

	public List<Course> getCourse() throws Exception {
		// TODO Auto-generated method stub
		return ad.getCourse();
	}

	public Course getCourseById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Course> getCourseByCid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateCourse(Course c) throws Exception {
		// TODO Auto-generated method stub
		return ad.updateCourse(c);
	}

	public List<Category> getCategory() throws Exception {
		// TODO Auto-generated method stub
	return ad.getCategory();
	}

	public List<Video> getVideo() throws Exception {
		// TODO Auto-generated method stub
		return ad.getVideo();
	}

	
	public boolean updateVideo(Video v) throws Exception {
		// TODO Auto-generated method stub
		return ad.updateVideo(v);
	}

	
	public int addVideo(Video vid, int Course_id) throws Exception {
		// TODO Auto-generated method stub
		return ad.addVideo(vid, Course_id);
	}

	
	public boolean updateCategory(Category c) throws Exception {
		// TODO Auto-generated method stub
		
		return ad.updateCategory(c);
	}


	public int addCategory(Category c) throws Exception {
		// TODO Auto-generated method stub
		return ad.addCategory(c);
	}

	
	public boolean deleteCategory(int id) throws Exception {
		// TODO Auto-generated method stub
		return ad.deleteCategory(id);
	}


	public boolean deleteVideo(int id) throws Exception {
		// TODO Auto-generated method stub
		return ad.deleteVideo(id);
	}

}
