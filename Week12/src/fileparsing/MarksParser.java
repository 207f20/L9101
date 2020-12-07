package fileparsing;

import java.io.*;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MarksParser {

	private String basePath;
	private int lineNumber = 0;

	public MarksParser(String path) {

		this.basePath = path;
		try {

			this.parseMarks();

		} catch (IOException e) {

		}

	}

	private void error(String mesg) {
		System.out.println("Error in line " + lineNumber + " " + mesg);
	}

	private void parseMarks() throws IOException {

		BufferedReader in = null;

		try {

			Pattern pStudentID = Pattern.compile("^(\\d+)\\s+([a-zA-Z]+)\\s*,\\s*([a-zA-Z\\s]+)$");
			
			// TODO: Fill in the regex below
			Pattern pComment = Pattern.compile("");
			Pattern pAssign = Pattern.compile("");
			Pattern pAssignMark = Pattern.compile("");
			Pattern pEndMarks = Pattern.compile("");
			
			// This is for a simpler assignment_marks.txt
			// To test with marks.txt, change the file name here
			// You can build on this file and make it work with the "marks.txt" (as described in parsing_question.pdf for practice)
			in = new BufferedReader(new FileReader(basePath+"/assignment_marks.txt"));

			int state = 0;
			String l;
			Matcher m;

			lineNumber = 0;

			while ((l = in.readLine()) != null) {

				lineNumber++;

				switch (state) {

				// This case is done for you -- it checks the student ID line format
				case 0:
					m = pStudentID.matcher(l);
					if (m.matches()) {
						System.out.println("Student #: " + m.group(1));
						System.out.println("First: " + m.group(3));
						System.out.println("Last: " + m.group(2));
						state = 1;
						break;
					} else {
						error("Expected student id" + l);
						return;
					}

				// This case is done for you -- it checks if the line is either a comment or assignment start line
				case 1:
					m = pComment.matcher(l);
					if (m.matches()) {
						break;
					}
					m = pAssign.matcher(l);
					if (m.matches()) {
						state = 2;
						break;
					} else {
						error("Expected comments or assignment start line");
						return;
					}

				// TODO: Complete the case below to work with "assignment_marks.txt"'s format
				case 2:
					break;
				}

			}

			if (state != 0) {
				error("Expected end of file");
			}

		} finally {
			if (in != null) {
				in.close();
			}
		}

	}

	public static void main(String[] args) {
		MarksParser mp = new MarksParser(Paths.get("").toAbsolutePath().toString());	
	}
}
