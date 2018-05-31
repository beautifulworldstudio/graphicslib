package graphicslib;

public class Brezengham
 {
  public static int[] line(int x1, int y1, int  x2, int y2)
   {
    int dx = x2 - x1;//xの距離
    int dy = y2 - y1;//yの距離
    int xadd = 1;
    int yadd = 1;

    if (dx < 0) xadd = -1;
    if (dy < 0) yadd = -1;
    dx = Math.abs(dx);
    dy = Math.abs(dy);

    int e = 0;//誤差
    int index = 0;//書き込みインデックス
    int[] result;

    if(dx > dy)
     {
      result = new int[(dx + 1) * 2];

      for (int y = y1, x = x1; x != x2; x+= xadd)
       {
        e += dy;
        if (e > dx)
         {
          e -= dx;
          y+=yadd;
         }

        result[index++] = x;
        result[index++] = y;
       }
     }
    else
     {
      result = new int[(dy + 1) * 2];

      for (int x = x1, y = y1; y != y2; y+= yadd)
       {
        e += dx;
        if (e > dy)
         {
          e -= dy;
          x+= xadd;
         }
        result[index++] = x;
        result[index++] = y;
       }
     }

    result[index++] = x2;
    result[index] = y2;

    return result;
   }
 }
