package com.david.ninjagold.controllers;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.david.ninjagold.models.NinjaGold;

@Controller
public class MainController {
	
	@RequestMapping("/index")
	public String index(HttpSession session) {
		
		NinjaGold ninjagold = (NinjaGold) session.getAttribute("ninjagold");
		if(ninjagold == null) {
			session.setAttribute("ninjagold", new NinjaGold());
		}
		return "index.jsp";
	}
	
	@PostMapping("/run")
	public String flip( @RequestParam(name="option") String option, HttpSession session, Model model) {
		System.out.println(option);
		
		if(option.equals("farm")) {
			Random rand = new Random();
			NinjaGold ninjagold = (NinjaGold) session.getAttribute("ninjagold");
			Integer cash = 10+rand.nextInt(20-10+1);
			ninjagold.gold += cash;
			ninjagold.pushActivity("You farmed " + cash + " gold pieces at " + LocalDateTime.now());
					
		}
		else if(option.equals("cave")) {
			Random rand = new Random();
			NinjaGold ninjagold = (NinjaGold) session.getAttribute("ninjagold");
			Integer cash = 5+rand.nextInt(10-5+1);
			ninjagold.gold += cash;
			ninjagold.pushActivity("You farmed " + cash + " gold pieces at " + LocalDateTime.now());
					
		}
		else if(option.equals("house")) {
			Random rand = new Random();
			NinjaGold ninjagold = (NinjaGold) session.getAttribute("ninjagold");
			Integer cash = 2+rand.nextInt(5-2+1);
			ninjagold.gold += cash;
			ninjagold.pushActivity("You farmed " + cash + " gold pieces at " + LocalDateTime.now());
					
		}
		else {
			Random rand = new Random();
			NinjaGold ninjagold = (NinjaGold) session.getAttribute("ninjagold");
			Integer num = 1+rand.nextInt(2-1+1);
			if(num == 1) {
				Integer cash = 1+rand.nextInt(50-1+1);
				ninjagold.gold += cash;
				ninjagold.pushActivity("You won " + cash + " gold pieces at " + LocalDateTime.now());
				
			}
			
			else {
				Integer cash = 1+rand.nextInt(50-1+1);
				ninjagold.gold -= cash;
				ninjagold.pushActivity("You lost " + cash + " gold pieces at " + LocalDateTime.now());
			}
					
		}
		
		
		return "redirect:/index";
	}
	
	
	
	
	
	@RequestMapping("/reset")
	public String reset(HttpSession session, Model model) {
		NinjaGold ninjagold = (NinjaGold) session.getAttribute("ninjagold");
		ninjagold.gold=0;
		ninjagold.activities = new ArrayList<String>();
		return "redirect:/index";
				
	}

}
