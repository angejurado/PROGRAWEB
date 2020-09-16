package pe.edu.pe.controller;

import java.util.ArrayList;    
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Membership;
import pe.edu.upc.serviceinterface.IDisctrictService;

@Named
@RequestScoped
public class MembershipController {
	@Inject
	private IDisctrictService lService;

	private Membership l;
	
	List<Membership> listMenbership;
	
	@PostConstruct
	public void init() {
	
		this.listMenbership = new ArrayList<Membership>();
		this.l = new Membership();
	}
	
	
	
	
	}



