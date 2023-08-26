import { HStack, Image } from "@chakra-ui/react";
import logo from "../assets/logo.png";
import ColorModeSwitch from "./ColorModeSwitch";

const Navbar = () => {
  return (
    <HStack padding="10px" justifyContent={"space-between"}>
      <Image src={logo} boxSize="60px" borderRadius={50} />
      <ColorModeSwitch />
    </HStack>
  );
};

export default Navbar;
