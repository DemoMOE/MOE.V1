package com.hcl.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.hcl.entity.User;

public class Reading {

	public static void main(String[] args) {
		BufferedReader br = null;

		try {

			String sCurrentLine;
			String[] s = null;

			br = new BufferedReader(new FileReader("E:\\\\text.text"));

			while ((sCurrentLine = br.readLine()) != null) {
				// System.out.println(sCurrentLine);
				s = sCurrentLine.split("/");
				if (sCurrentLine!=null && sCurrentLine != "\\n") {
					int len = s.length;
					if (len > 0) {
						for (int i = 0; i < len; i++) {
							User user = new User(s[i], ((++i) == len) ? null : s[i], ((++i) == len) ? null
									: (i > len) ? null : s[i]);
							System.out.println(user);
						}
					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
