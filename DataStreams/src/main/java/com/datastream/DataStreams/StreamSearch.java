package com.datastream.DataStreams;
import java.util.*;
import java.util.stream.Collectors;
public class StreamSearch {
	public static List<String> search(ArrayList<String> arr) {
		return arr.parallelStream().filter(s->s.startsWith("a")).filter(s->s.length() == 3).collect(Collectors.toList());
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		ArrayList<String> arr = new ArrayList<String>();
		for(int i = 0;i<n;i++) {
			arr.add(input.next());
		}
		System.out.println(search(arr));
	}
}
