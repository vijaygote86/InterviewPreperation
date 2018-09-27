package Barclays;
import java.util.HashMap;
import java.util.HashSet;


public class BarclaysSeatReservation {


	public int solution(int N, String S) {

		int seatCounts = 0;
		int familyCount = 0;
		boolean flag = false;
		HashSet<String> h = new HashSet<>();
		String[] reservedArray = S.split(" ");
		for(int i=0; i<reservedArray.length; i++)
		{
			h.add(reservedArray[i]);
		}

		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "D");
		hm.put(5, "E");
		hm.put(6, "F");
		hm.put(7, "G");
		hm.put(8, "H");      
		hm.put(9, "J");
		hm.put(10, "K");


		for(int i=1; i<=N; i++)
		{
			for(int j=1; j<=3; j++)
			{
				String row = hm.get(j);
				String col = Integer.toString(i);
				String seat = col + row;
				if(!h.contains(seat))
				{
					++seatCounts;
					flag = true;
					if(seatCounts == 3)
					{
						familyCount++;
						seatCounts = 0;
					}
				}
				else
				{
					if(seatCounts<3 && flag)
					{
						seatCounts = 0;
						flag = false;
					}

				}
			}
			seatCounts =0;

			for(int j=4; j<=7; j++)
			{
				String row = hm.get(j);
				String col = Integer.toString(i);
				String seat = col + row;
				if(!h.contains(seat))
				{
					++seatCounts;
					flag = true;
					if(seatCounts == 3)
					{
						familyCount++;
						seatCounts = 0;
					}
				}
				else
				{
					if(seatCounts<3 && flag)
					{
						seatCounts = 0;
						flag = false;
					}
				}
			}

			seatCounts = 0;
			for(int j=8; j<=10; j++)
			{
				String row = hm.get(j);
				String col = Integer.toString(i);
				String seat = col + row;
				if(!h.contains(seat))
				{
					++seatCounts;
					flag = true;
					if(seatCounts == 3)
					{
						familyCount++;
						seatCounts = 0;
					}
				}
				else
				{
					if(seatCounts<3 && flag)
					{
						seatCounts = 0;
						flag = false;
					}

				}
			}
		}
		return familyCount;
	}
}
