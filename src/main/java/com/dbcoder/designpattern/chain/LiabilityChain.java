package com.dbcoder.designpattern.chain;

public class LiabilityChain {

  public void runChain(){
    Task task3 = new Task1();
    Task task2 = new Task2(task3);
    Task task1 = new Task3(task2);
    task1.run();
  }

}
