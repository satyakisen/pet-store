import { IconButton } from "@chakra-ui/react";
import { BsMoonFill } from "react-icons/bs";

const ColorModeSwitch = () => {
  return (
    <IconButton
      aria-label="color mode"
      icon={<BsMoonFill />}
      colorScheme="grey.300"
      variant="ghost"
    ></IconButton>
  );
};

export default ColorModeSwitch;
