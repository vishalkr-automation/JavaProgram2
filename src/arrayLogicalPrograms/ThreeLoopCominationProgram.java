package arrayLogicalPrograms;

public class ThreeLoopCominationProgram {
	
	/*
	 Output: Three Loop multiple combination program

000 001 002 003 004 
010 011 012 013 014 
020 021 022 023 024 
030 031 032 033 034 
040 041 042 043 044 
100 101 102 103 104 
110 111 112 113 114 
120 121 122 123 124 
130 131 132 133 134 
140 141 142 143 144 
200 201 202 203 204 
210 211 212 213 214 
220 221 222 223 224 
230 231 232 233 234 
240 241 242 243 244 
300 301 302 303 304 
310 311 312 313 314 
320 321 322 323 324 
330 331 332 333 334 
340 341 342 343 344 
400 401 402 403 404 
	 
	 */
	public static void multiNumberEquation(int n) {
		System.out.println(" Execution started");

		for (int x = 0; x < n; x++) {

			for (int y = 0; y < n; y++) {

				for (int z = 0; z < n; z++) {

					System.out.print(x + "" + y + "" + z + " ");

				}

				System.out.println();
			}

		}
	}

	public static void main(String[] args) {
		multiNumberEquation(5);
	}
 
}
