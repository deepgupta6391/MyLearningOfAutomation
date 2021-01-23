package java2blog;

public class SearchElementInASortedMatrix {

	public static void main(String[] args) {
		int[][] sortedMatrix = { { 1, 6, 10, 12, 20 }, { 4, 8, 15, 22, 25 }, { 5, 20, 35, 37, 40 },
				{ 10, 28, 38, 45, 55 } };

		searchElementInSortedMatrix(sortedMatrix, 37);
	}

	public static void searchElementInSortedMatrix(int sortedMatrix[][], int n) {
		int rows = sortedMatrix.length;
		int cols = sortedMatrix[0].length;
		int r = 0, c = cols - 1;
		while (r < rows && c < cols) {
			if (sortedMatrix[r][c] == n) {
				System.out.println("The element is found and the rows are cols are : " + r + " " + c);
				break;
			} else {
				if (n < sortedMatrix[r][c]) {
					c--;
				} else {
					r++;
				}

			}
		}

	}

}
