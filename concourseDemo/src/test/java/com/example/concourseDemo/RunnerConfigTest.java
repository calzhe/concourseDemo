package com.example.concourseDemo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunnerConfigTest {

    @Test
    public void helloworld() {
        RunnerConfig rc = new RunnerConfig();
        String actual = rc.helloworld();
        String expected = "hello world";

        Assert.assertEquals(expected, actual);

    }
}