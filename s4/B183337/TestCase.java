package s4.B183337; // Please modify to s4.Bnnnnnn, where nnnnnn is your student ID.
import java.lang.*;
import s4.specification.*;

/*
interface FrequencerInterface {     // This interface provides the design for frequency counter.
	void setTarget(byte[]  target); // set the data to search.
	void setSpace(byte[]  space);  // set the data to be searched target from.
	int frequency(); //It return -1, when TARGET is not set or TARGET's length is zero
					//Otherwise, it return 0, when SPACE is not set or Space's length is zero
					//Otherwise, get the frequency of TAGET in SPACE
	int subByteFrequency(int start, int end);
	// get the frequency of subByte of taget, i.e target[start], taget[start+1], ... , target[end-1].
	// For the incorrect value of START or END, the behavior is undefined.
}
*/

/*
package s4.specification;
public interface InformationEstimatorInterface{
	void setTarget(byte target[]); // set the data for computing the information quantities
	void setSpace(byte space[]); // set data for sample space to computer probability
	double estimation(); // It returns 0.0 when the target is not set or Target's length is zero;
// It returns Double.MAX_VALUE, when the true value is infinite, or space is not set.
// The behavior is undefined, if the true value is finete but larger than Double.MAX_VALUE.
// Note that this happens only when the space is unreasonably large. We will encounter other problem anyway.
// Otherwise, estimation of information quantity,
}
*/

/* First Class Test

public class TestCase {
	public static void main(String[] args) {

		System.out.println("TestCase for Frequencer: Hi Ho Hi Ho");
		try {
			FrequencerInterface  myObject;
			int freq;
			System.out.println("checking s4.B183337.Frequencer");
			myObject = new s4.B183337.Frequencer();
			myObject.setSpace("Hi Ho Hi Ho".getBytes());
			myObject.setTarget("H".getBytes());
			freq = myObject.frequency();
			System.out.print("\"H\" in \"Hi Ho Hi Ho\" appears "+freq+" times. ");
			if(4 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
		}
		catch(Exception e) {
			System.out.println("Exception occurred: STOP");
		}
		System.out.println("TestCase for Frequencer: TARGET is not set.");
		try {
			FrequencerInterface  myObject;
			int freq;
			System.out.println("checking s4.B183337.Frequencer");
			myObject = new s4.B183337.Frequencer();
			myObject.setSpace("AAABBBCCC".getBytes());
			freq = myObject.frequency();
			System.out.print("\"\" in \"AAABBBCCC\" appears "+freq+" times. ");
			if(-1 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
		}
		catch(Exception e) {
			System.out.println("Exception occurred: STOP");
		}
		System.out.println("TestCase for Frequencer: TARGET's length is zero.");
		try {
			FrequencerInterface  myObject;
			int freq;
			System.out.println("checking s4.B183337.Frequencer");
			myObject = new s4.B183337.Frequencer();
			myObject.setSpace("AAABBBCCC".getBytes());
			myObject.setTarget("".getBytes());
			freq = myObject.frequency();
			System.out.print("\"\" in \"AAABBBCCC\" appears "+freq+" times. ");
			if(-1 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
		}
		catch(Exception e) {
			System.out.println("Exception occurred: STOP");
		}
		System.out.println("TestCase for Frequencer: SPACE is not set.");
		try {
			FrequencerInterface  myObject;
			int freq;
			System.out.println("checking s4.B183337.Frequencer");
			myObject = new s4.B183337.Frequencer();
			myObject.setTarget("AA".getBytes());
			freq = myObject.frequency();
			System.out.print("\"AA\" in \"\" appears "+freq+" times. ");
			if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
		}
		catch(Exception e) {
			System.out.println("Exception occurred: STOP");
		}
		System.out.println("TestCase for Frequencer: SPACE's length is zero.");
		try {
			FrequencerInterface  myObject;
			int freq;
			System.out.println("checking s4.B183337.Frequencer");
			myObject = new s4.B183337.Frequencer();
			myObject.setSpace("".getBytes());
			myObject.setTarget("AA".getBytes());
			freq = myObject.frequency();
			System.out.print("\"AA\" in \"\" appears "+freq+" times. ");
			if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
		}
		catch(Exception e) {
			System.out.println("Exception occurred: STOP");
		}
		System.out.println("TestCase for Frequencer: A first character of TARGET exists at end of SPACE.");
		try {
			FrequencerInterface  myObject;
			int freq;
			System.out.println("checking s4.B183337.Frequencer");
			myObject = new s4.B183337.Frequencer();
			myObject.setSpace("AABBC".getBytes());
			myObject.setTarget("CB".getBytes());
			freq = myObject.frequency();
			System.out.print("\"CB\" in \"AABBC\" appears "+freq+" times. ");
			if(0 == freq) { System.out.println("OK"); } else {System.out.println("WRONG"); }
		}
		catch(Exception e) {
			System.out.println("Exception occurred: STOP");
		}

		System.out.println("TestCase for InformationEstimator: Default");
		try {
			InformationEstimatorInterface myObject;
			double value;
			System.out.println("checking s4.B183337.InformationEstimator");
			myObject = new s4.B183337.InformationEstimator();
			myObject.setSpace("3210321001230123".getBytes());
			myObject.setTarget("0".getBytes());
			value = myObject.estimation();
			System.out.println(">0 "+value);
			myObject.setTarget("01".getBytes());
			value = myObject.estimation();
			System.out.println(">01 "+value);
			myObject.setTarget("0123".getBytes());
			value = myObject.estimation();
			System.out.println(">0123 "+value);
			myObject.setTarget("00".getBytes());
			value = myObject.estimation();
			System.out.println(">00 "+value);
		}
		catch(Exception e) {
			System.out.println("Exception occurred: STOP");
		}

		System.out.println("TestCase for InformationEstimator: TARGET is not set.");
		try {
			InformationEstimatorInterface myObject;
			double value;
			System.out.println("checking s4.B183337.InformationEstimator");
			myObject = new s4.B183337.InformationEstimator();
			myObject.setSpace("3210321001230123".getBytes());
			value = myObject.estimation();
			System.out.println(">0 "+value);
		}
		catch(Exception e) {
			System.out.println("Exception occurred: STOP");
		}

		System.out.println("TestCase for InformationEstimator: TARGET's length is zero.");
		try {
			InformationEstimatorInterface myObject;
			double value;
			System.out.println("checking s4.B183337.InformationEstimator");
			myObject = new s4.B183337.InformationEstimator();
			myObject.setSpace("3210321001230123".getBytes());
			myObject.setTarget("".getBytes());
			value = myObject.estimation();
			System.out.println(">\"\" "+value);
		}
		catch(Exception e) {
			System.out.println("Exception occurred: STOP");
		}

		System.out.println("TestCase for InformationEstimator: SPACE is not set.");
		try {
			InformationEstimatorInterface myObject;
			double value;
			System.out.println("checking s4.B183337.InformationEstimator");
			myObject = new s4.B183337.InformationEstimator();
			myObject.setTarget("0".getBytes());
			value = myObject.estimation();
			System.out.println(">0 "+value);
		}
		catch(Exception e) {
			System.out.println("Exception occurred: STOP");
		}
	}
}
*/

/* * * * * * * * * *
 * Open Basic Test
 * * * * * * * * * */
public class TestCase {
    public static void main(String[] args) {
	int c;
	c = 0;
	try {
	    FrequencerInterface  myObject;
	    int freq;
		    c = 0;
	    System.out.println("checking Frequencer");
	    myObject = new Frequencer();
	    freq = myObject.frequency();
	    if(-1 != freq) { System.out.println("frequency() should return -1, when target is not set, but returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setTarget("".getBytes());
	    freq = myObject.frequency();
	    if(-1 != freq) { System.out.println("frequency() should return -1, when target is empty, but return "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    if(-1 != freq) { System.out.println("frequency() for AAA should return -1, when target is  not set. But it returns  "+freq); c++; }	
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    myObject.setTarget("".getBytes());
	    freq = myObject.frequency();
	    if(-1 != freq) { System.out.println("frequency() for AAA should return -1, when taget empty string. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setTarget("A".getBytes());
	    freq = myObject.frequency();	   
 	    if(0 != freq) { System.out.println("frequency() for not set, should return 0, when taget is not empty. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("".getBytes());
	    myObject.setTarget("A".getBytes());
	    freq = myObject.frequency();	   
 	    if(0 != freq) { System.out.println("frequency() for empty space, should return 0, when taget is not empty. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    myObject.setTarget("A".getBytes());
	    freq = myObject.frequency();
	    if(3 != freq) { System.out.println("frequency() for AAA, should return 3, when taget is A. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    myObject.setTarget("AA".getBytes());
	    freq = myObject.frequency();
	    if(2 != freq) { System.out.println("frequency() for AAA, should return 2, when taget is AA. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    myObject.setTarget("AAA".getBytes());
	    freq = myObject.frequency();
	    if(1 != freq) { System.out.println("frequency() for AAA, should return 1, when taget is AAA. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAA".getBytes());
	    myObject.setTarget("AAAA".getBytes());
	    freq = myObject.frequency();
	    if(0 != freq) { System.out.println("frequency() for AAA, should return 0, when taget is AAAA. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("H".getBytes());
	    freq = myObject.frequency();
	    if(4 != freq) {System.out.println("frequency() for Hi_Ho_Hi_Ho, should return 4, when taget is H. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("Hi Ho Hi Ho".getBytes());
	    myObject.setTarget("Ho".getBytes());
	    freq = myObject.frequency();
	    if(2 != freq) {System.out.println("frequency() for Hi_Ho_Hi_Ho, should return 2, when taget is Ho. But it returns "+freq); c++; }
	    /* please note subByteFreqency(0,0) is considered illeagal specification, and you should not include this case */
	    myObject = new Frequencer();
	    myObject.setSpace("AAAB".getBytes());
	    myObject.setTarget("AAAAB".getBytes());
	    freq = myObject.subByteFrequency(0,1);
	    if(3 != freq) { System.out.println("SubBytefrequency() for AAAB, should return 3, when taget is AAAAB[0:1]. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAAB".getBytes());
	    myObject.setTarget("AAAAB".getBytes());
	    freq = myObject.subByteFrequency(1,2);
	    if(3 != freq) { System.out.println("SubBytefrequency() for AAAB, should return 2, when taget is AAAAB[1:2]. But it returns "+freq); c++; }
	    if(2 == freq) { System.out.println("You might be confused by the intentional error in sample code.");   }
	    myObject = new Frequencer();
	    myObject.setSpace("AAAB".getBytes());
	    myObject.setTarget("AAAAB".getBytes());
	    freq = myObject.subByteFrequency(1,3);
	    if(2 != freq) { System.out.println("SubBytefrequency() for AAAB, should return 2, when taget is AAAAB[1:3]. But it returns "+freq); c++; }
	    myObject = new Frequencer();
	    myObject.setSpace("AAAB".getBytes());
	    myObject.setTarget("AAAAB".getBytes());
	    freq = myObject.subByteFrequency(4,5);
	    if(1 != freq) { 
		System.out.println("SubBytefrequency() for AAAB, should return 1, when taget is AAAAB[4:5]. But it returns "+freq); c++;  
	    }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred in Frequencer Object: STOP");
	}

	try {
	    InformationEstimatorInterface myObject;
	    double value;
	    System.out.println("checking s4.slow.InformationEstimator");
	    myObject = new InformationEstimator();
	    myObject.setSpace("3210321001230123".getBytes());
	    myObject.setTarget("0".getBytes());
	    value = myObject.estimation();
	    if((value < 1.9999) || (2.0001 <value)) { System.out.println("IQ for 0 in 3210321001230123 should be 2.0. But it returns "+value); c++; }
	    myObject.setTarget("01".getBytes());
	    value = myObject.estimation();
	    if((value < 2.9999) || (3.0001 <value)) { System.out.println("IQ for 01 in 3210321001230123 should be 3.0. But it returns "+value); c++; }
	    myObject.setTarget("0123".getBytes());
	    value = myObject.estimation();
	    if((value < 2.9999) || (3.0001 <value)) { System.out.println("IQ for 0123 in 3210321001230123 should be 3.0. But it returns "+value); c++; }
	    myObject.setTarget("00".getBytes());
	    value = myObject.estimation();
	    if((value < 3.9999) || (4.0001 <value)) { System.out.println("IQ for 00 in 3210321001230123 should be 4.0. But it returns "+value); c++; }
	}
	catch(Exception e) {
	    System.out.println("Exception occurred: STOP");
	}
	if(c == 0) { System.out.println("TestCase OK"); }
    }
}	    
