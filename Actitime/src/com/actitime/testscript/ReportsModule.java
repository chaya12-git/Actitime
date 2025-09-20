package com.actitime.testscript;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsModule {
  @Test
public void createReport(){
  Reporter.log("createReport",true);
}
}
