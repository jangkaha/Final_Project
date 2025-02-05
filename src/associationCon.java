public class associationCon {
    private int x1,x2,y1,y2;
    private double ax,ay, bx,by,cx,cy, angle1, alpha, beta;
    private double AB, AC, BC, x1A;



    public associationCon(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        //this.bx = x2;
        //this.by = y2;

        //this.AB = 10 * Math.cos(30);
        //this.AC = 10 * Math.sin(30);
        //this.BC = 10;

        this.angle1 = (double) Math.toDegrees(Math.atan2(y2 - y1, x2 - x1));
        //this.x1A = Math.sqrt(Math.pow(Math.abs(y1-y2),2) + Math.pow((Math.abs(x1-x2)),2));
        //this.ax = Math.cos(angle1) * x1A;
        //this.ay = Math.sin(angle1) * x1A;

        this.alpha = 60 + angle1;
        this.cy = 10 * Math.sin(alpha) + y2;
        this.cx = 10 * Math.cos(alpha) + x2;

        this.beta = 60 - angle1;
        this.by = 10 * Math.sin(beta) + y2;
        this.bx = 10 * Math.cos(beta) + x2;

        if (y1 < y2) {
            this.alpha = 60 + angle1;
            this.cy = 10 * Math.sin(alpha) + y2;
            this.cx = 10 * Math.cos(alpha) + x2;

            this.beta = 60 - angle1;
            this.by = 10 * Math.sin(beta) + y2;
            this.bx = 10 * Math.cos(beta) + x2;
        } else {
            this.angle1 = angle1 * -1;
            this.alpha = 60 + angle1;
            this.cy = 10 * Math.sin(alpha) + y2;
            this.cx = 10 * Math.cos(alpha) + x2;

            this.beta = 60 - angle1;
            this.by = 10 * Math.sin(beta) + y2;
            this.bx = 10 * Math.cos(beta) + x2;
        }

    }

    public int getX1() {
        return x1;
    }

    public int getY2() {
        return y2;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public double getBx() {
        return bx;
    }

    public double getBy() {
        return by;
    }

    public double getAngle1() {
        return angle1;
    }
}
