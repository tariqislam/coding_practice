package com.fc.hackerrank;

import java.lang.StringBuffer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by tislam on 11/13/15.
 */
public class VMware {


    public static void main(String[] args) {
        // write your code here
    }

    public void newFunc() {

    }

    public void run() {

        StringBuffer result = new StringBuffer();
        int lineNumber = 0, numTests;

        try {

            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            numTests = Integer.parseInt(bufferedReader.readLine());
            lineNumber = 1;
            String input;
            String[] events;

            while ((input = bufferedReader.readLine()) != null) {
                lineNumber++;

                if ((lineNumber - 1) > numTests) {
                    result.append("FAILURE => WRONG INPUT (LINE " + lineNumber + ")\n");
                }
                else {
                    events = input.split(" ");
                    result.append(this.validateEventStream(events, lineNumber) + "\n");
                }
            }

            System.out.print(result.toString());

        }
        catch (IOException io) {
            io.printStackTrace();
        }
        catch (NumberFormatException e) {
            result.append("FAILURE => WRONG INPUT (LINE " + lineNumber + ")");
        }
    }


    private String validateEventStream(String[] events, int lineNumber) {
        StringBuffer result = new StringBuffer();
        int numEvents = events.length;
        int i, eventId, maxEventId;
        maxEventId = 0;

        try {
            // check that all events are integers, and find max
            for (i=0; i<numEvents; i++) {
                eventId = Integer.parseInt(events[i]);
                maxEventId = (eventId > maxEventId) ? eventId : maxEventId;
            }

            // I am assuming that ids will never be repeated, and always start at 1
            if (maxEventId != numEvents) {
                result.append("FAILURE => RECEIVED: " + numEvents + ", EXPECTED: " + maxEventId);
            }
            else {
                result.append("SUCCESS => RECEIVED: " + maxEventId);
            }

        }
        catch (NumberFormatException e) {
            result.append("FAILURE => WRONG INPUT (LINE " + lineNumber + ")");
        }

        return result.toString();
    }


}


