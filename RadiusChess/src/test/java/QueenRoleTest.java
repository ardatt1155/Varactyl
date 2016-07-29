
/**
 * Created by ardatt1155
 */

import org.junit.Test;
import java.util.List;

public class QueenRoleTest
{
    @Test
    public void moves()
    {
        RoleInterface role = new QueenRole();
        List<Square> moves = null;

        moves = role.nextSquares(new Square(1, 1), new Square(4, 3));
        org.junit.Assert.assertTrue(moves.size() == 9);

        moves = role.nextSquares(new Square(0, 1), new Square(4, 3));
        org.junit.Assert.assertTrue(moves.size() == 7);
    }
}
