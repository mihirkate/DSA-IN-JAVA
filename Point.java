import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Point {
    class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    class Cluster {
        Point centroid;
        List<Point> points;

        public Cluster(Point initialCentroid) {
            this.centroid = initialCentroid;
            this.points = new ArrayList<>();
        }

        public void addPoint(Point point) {
            points.add(point);
        }

        public void clearPoints() {
            points.clear();
        }

        public Point getCentroid() {
            return centroid;
        }
    }

    public class KMeans {
        private int k;
        private List<Point> dataPoints;
        private List<Cluster> clusters;

        public KMeans(int k, List<Point> dataPoints) {
            this.k = k;
            this.dataPoints = dataPoints;
            this.clusters = new ArrayList<>();
        }

        public void initializeClusters() {
            Random random = new Random();

            for (int i = 0; i < k; i++) {
                Point randomPoint = dataPoints.get(random.nextInt(dataPoints.size()));
                Cluster cluster = new Cluster(randomPoint);
                clusters.add(cluster);
            }
        }

        public void run(int maxIterations) {
            for (int iteration = 0; iteration < maxIterations; iteration++) {
                assignPointsToClusters();
                updateClusterCentroids();
            }
        }

        private void assignPointsToClusters() {
            for (Cluster cluster : clusters) {
                cluster.clearPoints();
            }

            for (Point point : dataPoints) {
                Cluster nearestCluster = null;
                double minDistance = Double.MAX_VALUE;

                for (Cluster cluster : clusters) {
                    double distance = calculateDistance(point, cluster.getCentroid());
                    if (distance < minDistance) {
                        minDistance = distance;
                        nearestCluster = cluster;
                    }
                }

                if (nearestCluster != null) {
                    nearestCluster.addPoint(point);
                }
            }
        }

        private void updateClusterCentroids() {
            for (Cluster cluster : clusters) {
                List<Point> points = cluster.points;
                if (!points.isEmpty()) {
                    double sumX = 0, sumY = 0;

                    for (Point point : points) {
                        sumX += point.x;
                        sumY += point.y;
                    }

                    cluster.centroid.x = sumX / points.size();
                    cluster.centroid.y = sumY / points.size();
                }
            }
        }

        private double calculateDistance(Point p1, Point p2) {
            double dx = p1.x - p2.x;
            double dy = p1.y - p2.y;
            return Math.sqrt(dx * dx + dy * dy);
        }

        public List<Cluster> getClusters() {
            return clusters;
        }
    }

}

    public static void main(String[] args) {
        public class Main {
            public static void main(String[] args) {
                List<Point> dataPoints = new ArrayList<>();
                dataPoints.add(new Point(1, 2));
                dataPoints.add(new Point(2, 3));
                dataPoints.add(new Point(8, 9));
                dataPoints.add(new Point(10, 11));
                // Add more data points here

                int k = 2;
                KMeans kMeans = new KMeans(k, dataPoints);
                kMeans.initializeClusters();
                kMeans.run(100);

                List<Cluster> clusters = kMeans.getClusters();
                for (int i = 0; i < clusters.size(); i++) {
                    System.out.println("Cluster " + (i + 1) + " centroid: " + clusters.get(i).centroid.x + ", "
                            + clusters.get(i).centroid.y);
                    System.out.println("Points in cluster:");
                    for (Point point : clusters.get(i).points) {
                        System.out.println(point.x + ", " + point.y);
                    }
                    System.out.println();
                }
            }
        }

    }
