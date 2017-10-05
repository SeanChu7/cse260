package fef;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class Lab1 {
	/*Printing Distinct Numbers
	Reads a String of 10 numbers and displays distinct numbers
	Might need to change based on what input is, also may need to change 
	output from arraylist to a string
	*/
	public Scanner scan = new Scanner(System.in);
	public void printNum() {
		int[] nums = new int[10];
		int index = 0;
		boolean found = false;
		for (int i = 0; i < 10; i++) {
			System.out.println("Input a Number");
			int g = Integer.parseInt(scan.nextLine());
			for (int k = 0; k < nums.length; k++) {
				if (nums[k] == g) {
					found = true;
				}
			}
			if (!found) {
				nums[index] = g;
				index++;
				found = false;
			}
			found = false;
		}
		for (int i =0; i < index; i ++) {
			System.out.print(nums[i]);
		}
	}
	
	public void executionTime() {
		int[] num = new int[100000];
		Random r = new Random();
		for (int i =0; i < num.length; i++) {
			num[i] = r.nextInt();
		}
		int key = r.nextInt();
		long startTime = System.currentTimeMillis();
		for (int i =0; i < num.length; i++) {
			if (key == num[i]) {
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		System.out.println("Time to do Linear Search:" + executionTime);
		Arrays.sort(num);
		int low = 0;
		int high = num.length -1;
		startTime = System.currentTimeMillis();
		while(high >= low) {
			int mid = (low + high) / 2;
			if (key < num[mid])
				high = mid-1;
			else if (key == num[mid])
				break;
			else
				low = mid+1;
		}
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println("Time to do Binary Search:" + executionTime);
		}
		
	public String ticTactoe() {
		char[][] board = new char[3][3];
		for (int i = 0; i < board.length; i++) {
			for (int g = 0; g < board[i].length; g++) {
				board[i][g] = '-';
			}
		}
		char turnPlayer = 'X';
		while(emptyBoard(board)) {
			for (int i = 0; i < board.length; i++) {
				for (int g = 0; g < board[i].length; g++) {
					System.out.print(board[i][g]);
				}
				System.out.print("\n");
			}
			System.out.println("The turnplayer is:" + turnPlayer);
			System.out.println("What row will you put your token in?");
			String row = scan.nextLine();
			System.out.println("What column will you put your token in?");
			String col = scan.nextLine();
			if (turnPlayer == 'X') {
				board[Integer.parseInt(row)][Integer.parseInt(col)]= 'X';
				if (checkWin(board,'X')) {
					return "Player X wins!";
				}
				turnPlayer = 'O';
			}
			else {
				board[Integer.parseInt(row)][Integer.parseInt(col)]= 'O';
				if (checkWin(board,'O')) {
					return "Player O wins!";
				}
				turnPlayer = 'X';
			}
		}
		return "It is a draw";
	}
	public boolean checkWin(char[][] b, char c) {
		for (int i = 0; i < b.length; i++) {
			if (b[i][0] == c && b[i][1] == c && b[i][2] == c) {
				return true;
			}
			if (b[0][i] == c && b[1][i] == c && b[2][i] == c) {
				return true;
			}
		}
		if (b[0][0] == c && b[1][1] == c && b[2][2] == c) {
			return true;
		}
		if (b[0][2] == c && b[1][1] == c && b[2][0] == c) {
			return true;
		}
		return false;
	}
	public boolean emptyBoard(char[][] b) {
		for (int i = 0; i < b.length; i++) {
			for (int g = 0; g < b[i].length; g++) {
				if (b[i][g] == '-') {
					return true;
				}
			}
		}
		return false;
	}
	public static int howManyCollatzIterations(int n) {
		if (n == 1) {
			return 0;
		}
		else if (n % 2 == 0) {
			return 1 + howManyCollatzIterations(n/2);
		}
		else {
			return 1 + howManyCollatzIterations((3*n)+1);
		}
	}
	public static void main(String[] args) {
		Lab1 test = new Lab1();
		System.out.println("Distinct Numbers Test:");
		test.printNum();
		System.out.print("\n");
		System.out.println("Testing Execution Time");
		test.executionTime();
		System.out.println("Testing TicTacToe");
		System.out.println(test.ticTactoe());
		System.out.println("Testing CollatzIterations for 53");
		System.out.println("Iterations:"+howManyCollatzIterations(53));
	}
}
