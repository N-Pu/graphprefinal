package backend.random;

import frontend.Style;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.*;

import java.util.*;
import java.util.stream.Stream;

public class RandomGraphGenerator {
    //    private Integer a, b;
//    private Integer I, C;  //
//    private Integer I1, C1;  //
    ArrayList<Integer> arrayList = new ArrayList<>(); // Array with 2 numbers
                                                      // I and Y sub-graphs

    Graph graph = new SingleGraph("Example Graph");
    Style style = new Style();


    public void GenerateA() {
    }

    public void GenerateB() {
    }

    public void GenerateC() {
    }

    public void GenerateD() {
    }

    public void GenerateE() {
    }


    public void BipartiteGraphCreator(Integer I, Integer C) {
        System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");
        graph.setAttribute("ui.stylesheet", style.getStyleSheet());

        for (int i = 0; i < I; i++) {
            graph.addNode("I" + i);

        }

        for (int h = 0; h < C; h++) {
            graph.addNode("C" + h);

        }

        for (Node node : graph) {
            node.setAttribute("ui.label", node.getId());


        }


    }


    public ArrayList<Integer> GenerateTwoMultiplicity(Integer a, Integer b) {

        return arrayList;
    }


    public void GraphDisplay() {             //Display method for MainClass
        graph.display();
    }


//    public void AddStyle() {
//        graph.setAttribute("ui.stylesheet", style.getStyleSheet());
//    }


}

