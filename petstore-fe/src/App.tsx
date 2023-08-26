import { Grid, GridItem, Show } from "@chakra-ui/react";
import Navbar from "./components/Navbar";

function App() {
  return (
    <Grid
      templateAreas={{
        base: `"navbar" "main"`,
        lg: `"navbar navbar" "aside main"`,
      }}
      templateColumns={{
        base: "1fr",
        lg: "200px 1fr",
      }}
    >
      <GridItem area={"navbar"}>
        <Navbar></Navbar>
      </GridItem>
      <Show above="lg">
        <GridItem bg="pink.300" area={"aside"}>
          Aside
        </GridItem>
      </Show>
      <GridItem bg="green.300" area={"main"}>
        Main
      </GridItem>
    </Grid>
  );
}

export default App;
