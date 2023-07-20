package com.example.test.jenkins;

import com.example.jenkins.JenkinsCalculations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class JenkinsCalsTest
{
    @Test
    public void addTest()
    {
        JenkinsCalculations jcal=new JenkinsCalculations();
        assertEquals(10,jcal.add(5,5));
    }

    @Test
    public void subtractTest()
    {
        JenkinsCalculations jcal=new JenkinsCalculations();
        assertEquals(10,jcal.subtract(15,5));
    }
}
