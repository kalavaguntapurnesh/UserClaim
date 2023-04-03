package com.springuserclaim.userclaim.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springuserclaim.userclaim.entities.UserClaim_Detail;



@Service
public class UserServiceImpl implements UserService{
	
	List<UserClaim_Detail> list;
	
	public UserServiceImpl()
	{
		list = new ArrayList<>();
		list.add(new UserClaim_Detail(1444, 1565, "claim type thing1", "claim value thing1"));
		list.add(new UserClaim_Detail(1000, 1888, "claim type thing2", "claim value thing2"));
	}
	
	
	@Override
	public List<UserClaim_Detail> getDetails() {
		// TODO Auto-generated method stub
		return list;
	}

}
