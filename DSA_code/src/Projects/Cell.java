package Projects;
import java.util.*;
import java.io.*;
import static Projects.Cell.*;


enum CellType1
{
	EMPTY,
	FOOD,
	SNAKE_NODE;
}

public class Cell 
{



		//to represent a cell of display board
	
		private final int row,col;
		private CellType1 celltype;
		
		public Cell(int row,int col)
		{
			this.row=row;
			this.col=col;
		}
		
		public CellType1 getCellType() {return celltype;	}
		
		public void setCellType(CellType1 celltype)
		{
			this.celltype=celltype;
		}
		
		public int getRow() {return row;}
		public int getCOl() {return col;}
	}
	
	
	
	


