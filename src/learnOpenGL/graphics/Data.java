package learnOpenGL.graphics;

import org.joml.Vector3f;

public class Data {
    //cubes
    private static final float[] cube = {
            // positions          // colors           // texture coords
            //front
             0.5f,  0.5f, 0.5f,   1.0f, 0.0f, 0.0f,   1.0f, 1.0f,   // top right
             0.5f, -0.5f, 0.5f,   0.0f, 1.0f, 0.0f,   1.0f, 0.0f,   // bottom right
            -0.5f, -0.5f, 0.5f,   0.0f, 0.0f, 1.0f,   0.0f, 0.0f,   // bottom left
            -0.5f,  0.5f, 0.5f,   1.0f, 1.0f, 0.0f,   0.0f, 1.0f,   // top left

            //back
             0.5f,  0.5f, -0.5f,   1.0f, 0.0f, 0.0f,   1.0f, 1.0f,   // top right
             0.5f, -0.5f, -0.5f,   0.0f, 1.0f, 0.0f,   1.0f, 0.0f,   // bottom right
            -0.5f, -0.5f, -0.5f,   0.0f, 0.0f, 1.0f,   0.0f, 0.0f,   // bottom left
            -0.5f,  0.5f, -0.5f,   1.0f, 1.0f, 0.0f,   0.0f, 1.0f,  // top left

            //top
             0.5f, 0.5f, -0.5f,   1.0f, 0.0f, 0.0f,   1.0f, 1.0f,   // top right
             0.5f, 0.5f,  0.5f,   0.0f, 1.0f, 0.0f,   1.0f, 0.0f,   // bottom right
            -0.5f, 0.5f,  0.5f,   0.0f, 0.0f, 1.0f,   0.0f, 0.0f,   // bottom left
            -0.5f, 0.5f, -0.5f,   1.0f, 1.0f, 0.0f,   0.0f, 1.0f,   // top left

            //bottom
             0.5f, -0.5f, -0.5f,  1.0f, 0.0f, 0.0f,   1.0f, 1.0f,   // top right
             0.5f, -0.5f,  0.5f,  0.0f, 1.0f, 0.0f,   1.0f, 0.0f,   // bottom right
            -0.5f, -0.5f,  0.5f,  0.0f, 0.0f, 1.0f,   0.0f, 0.0f,   // bottom left
            -0.5f, -0.5f, -0.5f,  1.0f, 1.0f, 0.0f,   0.0f, 1.0f,   // top left

            //right
            0.5f,  0.5f, -0.5f,   1.0f, 0.0f, 0.0f,   1.0f, 1.0f,   // top right
            0.5f, -0.5f, -0.5f,   0.0f, 1.0f, 0.0f,   1.0f, 0.0f,   // bottom right
            0.5f, -0.5f,  0.5f,   0.0f, 0.0f, 1.0f,   0.0f, 0.0f,   // bottom left
            0.5f,  0.5f,  0.5f,   1.0f, 1.0f, 0.0f,   0.0f, 1.0f,   // top left

            //left
            -0.5f,  0.5f, -0.5f,  1.0f, 0.0f, 0.0f,   1.0f, 1.0f,   // top right
            -0.5f, -0.5f, -0.5f,  0.0f, 1.0f, 0.0f,   1.0f, 0.0f,   // bottom right
            -0.5f, -0.5f,  0.5f,  0.0f, 0.0f, 1.0f,   0.0f, 0.0f,   // bottom left
            -0.5f,  0.5f,  0.5f,  1.0f, 1.0f, 0.0f,   0.0f, 1.0f    // top left
    };

    private static final int[] cubeIndices = {
            0,1,3,
            1,2,3,

            4,5,7,
            5,6,7,

            8,9,11,
            9,10,11,

            12,13,15,
            13,14,15,

            16,17,19,
            17,18,19,

            20,21,23,
            21,22,23
    };

    private static final Vector3f[] cubePositions = {
            new Vector3f( 0.0f,  0.0f,  0.0f),
            new Vector3f( 2.0f,  5.0f, -15.0f),
            new Vector3f(-1.5f, -2.2f, -2.5f),
            new Vector3f(-3.8f, -2.0f, -12.3f),
            new Vector3f( 2.4f, -0.4f, -3.5f),
            new Vector3f(-1.7f,  3.0f, -7.5f),
            new Vector3f( 1.3f, -2.0f, -2.5f),
            new Vector3f( 1.5f,  2.0f, -2.5f),
            new Vector3f( 1.5f,  0.2f, -1.5f),
            new Vector3f(-1.3f,  1.0f, -1.5f)
    };

    //floor
    private static final float[] floor = {
            // positions         // colors           // texture coords
             0.5f, 0.0f, -0.5f,  1.0f, 0.0f, 0.0f,   1.0f, 1.0f,   // top right
             0.5f, 0.0f,  0.5f,  0.0f, 1.0f, 0.0f,   1.0f, 0.0f,   // bottom right
            -0.5f, 0.0f,  0.5f,  0.0f, 0.0f, 1.0f,   0.0f, 0.0f,   // bottom left
            -0.5f, 0.0f, -0.5f,  1.0f, 1.0f, 0.0f,   0.0f, 1.0f,   // top left
    };

    private static final int[] floorIndices = {
            0, 1, 3,
            1, 2, 3,
    };

    private static final Vector3f floorPosition = new Vector3f(0.0f, -2.2f,0.0f);

    private static float[] getFilledArcVertexes(float x, float y, float r, double startingAngleDeg, double endAngleDeg, int slices) {
        int radius = (int) r;

        double arcAngleLength = (endAngleDeg - startingAngleDeg) * Math.PI / 180f;

        float[] vertexes = new float[slices*24];

        double initAngle = Math.PI / 180f * startingAngleDeg;
        float prevXA = (float) Math.cos(initAngle) * radius;
        float prevYA = (float) Math.sin(initAngle) * radius;

        for(int arcIndex = 0; arcIndex < slices; arcIndex++) {
            double angle = startingAngleDeg * Math.PI / 180f + arcAngleLength * ((float)arcIndex + 1) / ((float)slices);
            int index = arcIndex * 24;
            float xa = (float) Math.cos(angle) * radius;
            float ya = (float) Math.sin(angle) * radius;
            vertexes[index] = x;
            vertexes[index+1] = y;
            vertexes[index+8] = x+prevXA;
            vertexes[index+9] = y+prevYA;
            vertexes[index+16] = x+xa;
            vertexes[index+17] = y+ya;
            prevXA = xa;
            prevYA = ya;
        }

        return vertexes;
    }

    public static int[] generateArcIndices(int slices) {
        int[] arcIndices = new int[slices*3];
        for (int i = 0; i < arcIndices.length; i++) {
            arcIndices[i] = i;
        }
        return arcIndices;
    }

    public static float[] setArc(float x, float y, float r, double startingAngleDeg, double endAngleDeg, int slices) {
        return getFilledArcVertexes(x, y, r, startingAngleDeg, endAngleDeg, slices);
    }

    public static int[] setArcIndices(int slices) {
        return generateArcIndices(slices);
    }

    public static float[] getCube() {
        return cube;
    }

    public static int[] getCubeIndices() {
        return cubeIndices;
    }

    public static Vector3f[] getCubePositions() {
        return cubePositions;
    }

    public static float[] getFloor() {
        return floor;
    }

    public static int[] getFloorIndices() {
        return floorIndices;
    }

    public static Vector3f getFloorPosition() {
        return floorPosition;
    }
}
