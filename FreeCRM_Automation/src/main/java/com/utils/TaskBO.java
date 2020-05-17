package com.utils;

import io.github.millij.poi.ss.model.annotations.Sheet;
import io.github.millij.poi.ss.model.annotations.SheetColumn;

@Sheet
public class TaskBO {
	
	@SheetColumn("Title")
	String title;
	
	@SheetColumn("AssignedTo")
	String assignedTo;
	
	@SheetColumn("Deal")
	String deal;
	
	@SheetColumn("Description")
	String description;
	
	@SheetColumn("Completion")
	String completion;
	
	@SheetColumn("Contact")
	String contact;
	
	@SheetColumn("Case")
	String case1;
	
	@SheetColumn("Identifier")
	String identifier;
	
	
	
	

}
