/**
 * Created by ardatt1155
 */

import java.util.List;
import java.util.ArrayList;

public class RookRole extends AbstractRole
{
    public RookRole()
    {
        this.role = Roles.Rook;
    }

    public List<Square> nextSquares(Square square, Square dimension)
    {
        List<Square> squares = new ArrayList<Square>();
        int dims = Math.max(dimension.x, dimension.y);
        for (int i = -dims; i < dims; ++i)
        {
            if (i == 0) continue;
            if (square.x + i < dimension.x && square.x + i > -1) squares.add(new Square(square.x + i, square.y));
            if (square.y + i < dimension.y && square.y + i > -1) squares.add(new Square(square.x, square.y + i));
        }
        return squares;
    }
}
