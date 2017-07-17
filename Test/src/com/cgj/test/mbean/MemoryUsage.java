package com.cgj.test.mbean;

public class MemoryUsage {
    public static void main(String[] args) {
        java.lang.management.MemoryUsage usage = java.lang.management.ManagementFactory.getMemoryMXBean()
                .getHeapMemoryUsage();
        System.out.println("Max: " + usage.getMax());
        System.out.println("Init: " + usage.getInit());
        System.out.println("Committed: " + usage.getCommitted());
        System.out.println("Used: " + usage.getUsed());
    }
}