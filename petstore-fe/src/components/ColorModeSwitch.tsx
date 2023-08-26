import {
  HStack,
  Icon,
  IconButton,
  Switch,
  useColorMode,
} from "@chakra-ui/react";
import { MdLightMode, MdDarkMode } from "react-icons/md";

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
