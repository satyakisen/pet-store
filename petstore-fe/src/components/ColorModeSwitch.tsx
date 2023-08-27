import { Switch, useColorMode } from "@chakra-ui/react";

const ColorModeSwitch = () => {
  const { colorMode, toggleColorMode } = useColorMode();

  return (
    <Switch
      isChecked={colorMode == "dark"}
      onChange={toggleColorMode}
      colorScheme="teal"
    >
      Dark Mode
    </Switch>
  );
};

export default ColorModeSwitch;
